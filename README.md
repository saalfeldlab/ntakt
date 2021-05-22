    [![Join the chat at https://gitter.im/saalfeldlab/ntakt](https://badges.gitter.im/saalfeldlab/ntakt.svg)](https://gitter.im/saalfeldlab/ntakt?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge) [![](https://jitpack.io/v/org.ntakt/ntakt.svg)](https://jitpack.io/#org.ntakt/ntakt) [![Build Status](https://api.travis-ci.com/saalfeldlab/ntakt.svg?branch=master)](https://travis-ci.com/saalfeldlab/ntakt) [![Build status](https://ci.appveyor.com/api/projects/status/cvi9r5hqyiiyenlu?svg=true)](https://ci.appveyor.com/project/hanslovsky/imklib2)


# nta.kt

The nta.kt library brings n-dimensional transformation and algebra to Kotlin! It combines the expressive power and flexibility of the Java image processing library [ImgLib2](https://github.com/imglib/imglib2) with the convenience and clarity that Kotlin language features provide. Internally, nta.kt uses Kotlin extension functions to overload operators, add infix functions, and other conveniences that would not be possible in Java. The result is a very concise and intuitive syntax comparable to what developers are familiar with from other scientific computing libraries such as [NumPy](https://numpy.org) or [Julia](https://julialang.org). For example, this is the Java code to multiply two images in ImgLib2:


``` java
// populate data
final var img1 = ArrayImgs.doubles(2, 3);
Views.iterable(img1).forEach(p -> p.setReal(0.1));
final var img2 = ArrayImgs.longs(2, 3);
final var cursor = Views.flatIterable(img2).cursor();
for (int i = 1; cursor.hasNext(); ++i)
    cursor.next().setInteger(i);

// multiply images
final var img3 = Converters.convert(
        img1,
        img2,
        (t, u, v) -> { v.setReal(u.getRealDouble()); v.mul(t); },
        new DoubleType());
Views.flatIterable(img3).forEach(System.out::println);

```

This is the equivalent in nta.kt:

``` kotlin
// populate data
val img1 = ntakt.doubles(2L, 3L) { 0.1 }
val img2 = ntakt.longs(2L, 3L) { it + 1L }
// multiply images
val img3 = img1 * img2
img3.flatIterable.forEach { println(it) }
```

In both cases, the output is

``` 
0.1
0.2
0.30000000000000004
0.4
0.5
0.6000000000000001
```

## Motivation & Core Concepts

ImgLib2 is designed and takes careful measures to be flexible and as efficient as possible on the JVM. 
For newcomers or people who transition from other languages and libraries such as Python's [NumPy](https://numpy.org), writing efficient code with ImgLib2 may not be intuitive or obvious.
For example, a NumPy user may add a two arrays like this:
```python
arr1 = ...
arr2 = ...
arr3 = arr1 + arr2
```
In ImgLib2, one way to add two `RandomAccessibleInterval`s (`RAI`; ImgLib2 "images"), is to create a converted view of the two images that calculates the sum at each pixel on demand:
```java
final RandomAccessibleInterval<IntType> rai1 = ...;
final RandomAccessibleInterval<IntType> rai2 = ...;
final RandomAccessibleInterval<IntType> rai3 = Converters.convert(rai1, rai2, (r1, r2, r3) -> { r3.set(r1); r3.add(r2); }, new IntType());
```
**Note**: This is by no means a comparison between NumPy and ImgLib2.

We created nta.kt to make ImgLib2 more convenient to use and accessible while maintaining its flexibility and efficiency. 
We picked Kotlin as a language because
 - operators can be [overloaded](https://kotlinlang.org/docs/reference/operator-overloading.html), e.g. `+`, `-`, `*`, `/`, for artbitrary types,
 - ImgLib2 interfaces can be extended with Kotlin [extension functions](https://kotlinlang.org/docs/reference/extensions.html) without the need for new wrapper classes, and
 - Kotlin code is compiled to the Java bytecode. When a user's needs cannot be met completely by nta.kt, they can always implement the missing parts using ImgLib2 in Kotlin.
 
### Core Concepts
Kotlin extension functions allow us to easily add new features and convenience methods to existing interfaces and classes.
For example,
```kotlin
fun String.hello() = "Hello, $this!"
println("nta.kt".hello())
```
prints
```
Hello, nta.kt!
```
to the console. Similarly, nta.kt extends ImgLib2 interfaces.
Many of the extensions exist already inside ImgLib2 core in namespace classes like `Views` or `Converters`
but interface or class methods (and extension functions) are more accessible through the auto-completion of any modern IDE.
For example, the Java code
```java
final var rai = ...
Converters.convert(rai, ...)
```
translates to
```
val rai = ...
rai.convert(...)
```
in nta.kt. In combination with operator overloading, nta.kt adds arithmetic operators to existing ImgLib2 interfaces, e.g.
```kotlin
val rai1: RAI<DoubleType> = ...
val rai2: RAI<DoubleType> = ...
val rai3 = rai1 + rai2
val rai4 = rai3 / 3.14
```
ntai.kt adds operators for `+`, `-`, `*`, and `/`. The [notebooks](notebooks/examples) provide more detailed examples. 

#### Extension Functions
Nta.kt adds convenience to ImgLib2 data structures with extension functions.
The following sections will cover extension functions that shared among the following data structures (package names omitted):
 - `RandomAccessible`
 - `RandomAccessibleInterval`
 - `RealRandomAccessible`
 - `RealRandomAccessiblerealInterval`

There are a few [extension functions](#data-structure-specific-extensions) that are specific to some of the data structures.

##### Conversion
Converters are probably the most fundamental and important extension.
This extension exposes the static convenience methods of the ImgLib2 [`Converters`](https://github.com/imglib/imglib2/blob/master/src/main/java/net/imglib2/converter/Converters.java)
class as extensions that can be called directly on class instances.
Converters are very powerful because they transform the values of a data structure (or of a pair of data structures)
into arbitrary values as defined by the caller without allocating any memory.
The value at each pixel/voxel is computed on demand when accessed.
Other names for this evaluation pattern are *lazy* or *view*:
```kotlin
val rai = ntakt.doubles(1L, 2L, 3L) { Random.nextDouble(0.0, 1.0) }
val scaledAndQuantizedRai = rai.convert(ntakt.types.unsignedByte) { s, t -> t.setInteger(round(255.0 * s.realDouble).toInt()) }

val rra1 = ntakt.function(2, { ntakt.types.float }) { p, t -> t.setReal(abs(p.getDoublePosition(0)) + abs(p.getDoublePosition(1))) }
val rra2 = ntakt.function(2, { ntakt.types.double }) { p, t -> t.setReal(sqrt(p.getDoublePosition(0).pow(2.0) + p.getDoublePosition(1).pow(2.0))) }
val meanRra = rra1.convert(rra2, ntakt.types.double) { s, t, u -> u.setReal(s.realDouble); u.add(t); u.mul(0.5) }
```

Note that for expensive operations, it may be beneficial to persist/materialize views to avoid repeated execution of the expensive operation.
Many of the other convenience functions are implemented as converters, e.g. the [arithmetic operators](#arithmetic-operators). 

#### Other Convenience Functions
*TBD*

##### Types
As an extension library for ImgLib2, nta.kt relies on ImgLib2's type system.
ImgLib2 has a type hierarchy of complex, real, and integer (signed and unsigned) types
that are named after their primitive type equivalents followed by `Type` and prefixed with `Unsigned` if applicable.
Type names follow CamelCase convention, e.g. `UnsignedByteType`.
These types are used frequently, e.g. to convert a `RandomAccessible` from `FloatType` to `DoubleType`,
and can be conveniently created with the properties in the `ntakt.types` object, e.g. `ntakt.types.unsignedByte`.
Types can also be created with aliases that specify the type (`int`, `uint`, `float`, `complex`) and the size in number of bits,
e.g. `uint8`, similar to what is used in other popular libraries like NumPy:

|   ImgLib2 Type in `ntakt.types` |        Alias |
| ------------------------------- | ------------ |
|                      `byteType` |       `int8` |
|                     `shortType` |      `int16` |
|                       `intType` |      `int32` |
|                      `longType` |      `int64` |
|              `unsignedByteType` |      `uint8` |
|             `unsignedShortType` |     `uint16` |
|               `unsignedIntType` |     `uint32` |
|              `unsignedLongType` |     `uint64` |
|                     `floatType` |    `float32` |
|                    `doubleType` |    `float64` |
|              `complexFloatType` |  `complex64` |
|             `complexDoubleType` | `complex128` |

##### Images
ImgLib2 is interface driven and a `RandomAccessibleInterval` can be backed by arbitrary data or even completely virtual.
The `ArrayImg` is one of the most straight forward ways to expose data as a `RandomAccessibleInterval`.
It is typically backed by Java primitive type arrays, but it can also read data from other backends like Java buffers.
`ArrayImgs` can be conveniently created for many ImgLib2 types including the ones listed [above](#Types).
Naming of these convenience functions follows the conventions in the [`ntakt.types`](#Types) object, e.g.
```kotlin
import org.ntakt.*
val data1 = ntakt.unsignedShorts(30, 40, 50)
// with initialization:
val data2 = ntakt.doubles(30, 40, 50) { 1.0 / it }
```
or with type aliases
```kotlin
import org.ntakt.*
val data1 = ntakt.uint16s(30, 40, 50)
// with initialization:
val data2 = ntakt.float64s(30, 40, 50) { 1.0 / it }
```



##### Arithmetic Operators
Operator overloading is possible for arithmetic operations (`+-*/`) on 
 1. ImgLib2 data structures and primitive types and generic types with the same bounds as the data structure
 2. Pairs of ImgLib2 data structures if
    1. Both data structures have the exact same generic bounds `T`. The return type is `T`.
    2. The generic type is any of `ntakt.types.realTypes` for each of the data structures. The return type is defined in the table below.
    3. As (ii) but the types are specified with star projection (`RealType<*>`) or as mixed generic bounds. The return type is `RealType<*>`.
       Will throw an `error` if the type for either data structure is `RealType<*>` that does not fulfil these criteria.

The following table specifies the output types for (2.ii) and (2.iii) for all arithmetic operations (`+-*/`).

|                 T/U |            ByteType |           ShortType |             IntType |            LongType |    UnsignedByteType |   UnsignedShortType |     UnsignedIntType |    UnsignedLongType |           FloatType |          DoubleType |
| ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- |
|            ByteType |            ByteType |           ShortType |             IntType |            LongType |           ShortType |             IntType |            LongType |            LongType |           FloatType |          DoubleType |
|           ShortType |           ShortType |           ShortType |             IntType |            LongType |           ShortType |             IntType |            LongType |            LongType |           FloatType |          DoubleType |
|             IntType |             IntType |             IntType |             IntType |            LongType |             IntType |             IntType |            LongType |            LongType |           FloatType |          DoubleType |
|            LongType |            LongType |            LongType |            LongType |            LongType |            LongType |            LongType |            LongType |            LongType |           FloatType |          DoubleType |
|    UnsignedByteType |           ShortType |           ShortType |             IntType |            LongType |    UnsignedByteType |   UnsignedShortType |     UnsignedIntType |    UnsignedLongType |           FloatType |          DoubleType |
|   UnsignedShortType |             IntType |             IntType |             IntType |            LongType |   UnsignedShortType |   UnsignedShortType |     UnsignedIntType |    UnsignedLongType |           FloatType |          DoubleType |
|     UnsignedIntType |            LongType |            LongType |            LongType |            LongType |     UnsignedIntType |     UnsignedIntType |     UnsignedIntType |    UnsignedLongType |           FloatType |          DoubleType |
|    UnsignedLongType |            LongType |            LongType |            LongType |            LongType |    UnsignedLongType |    UnsignedLongType |    UnsignedLongType |    UnsignedLongType |           FloatType |          DoubleType |
|           FloatType |           FloatType |           FloatType |           FloatType |           FloatType |           FloatType |           FloatType |           FloatType |           FloatType |           FloatType |          DoubleType |
|          DoubleType |          DoubleType |          DoubleType |          DoubleType |          DoubleType |          DoubleType |          DoubleType |          DoubleType |          DoubleType |          DoubleType |          DoubleType |


#### Data Structure Specific Extensions
*TBD*

#### Indexed Access Operators

##### Voxel Access 
Individual voxels of `RandomAccessible` (and by extension `RandomAccessibleInterval`) instances can be accessed via the
`[]` operator that is overloaded for `vararg Int`, `vararg Long`, and `Localizable`:
```kotlin
val ra: RandomAccessible<T> = ...
val t1: T = ra[1, 2, 3]
val t2: T = ra[1L, 2L, 3L]
val t3: T = ra[Point(1, 2, 3)]
```
Similarly, voxels of `RealRandomAccessible` (and by extension `RealRandomAccessibleRealInterval`) instances can be accessed via the
`[]` operator that is overloaded for `varargf Float`, `vararg Double`, and `RealLocalizable`:
```kotlin
val rra: RealRandomAccessible<T> = ...
val t1: T = ra[1.0, 2.0, 3.0]
val t2: T = ra[1.0f, 2.0f, 3.0f]
val t3:T = ra[RealPoint(1.0, 2.0, 3.0)]

```

**Note**: This access pattern is designed for convenience but is not very efficient because it creates a new `Sampler` object instance for each value. Use in tight loop is discouraged.
For efficient access of (large numbers of) individual voxels, this `Sampler` instance should be reused, use ImgLib2 `Cursor`, `RandomAccess`, or foreach constructs such as with `LoopBuilder`.

##### Intervals
It is common practice to restrict unbounded `RandomAccessible` instances to certain intervals, e.g. when cropping a block out of a function defined on infinite domain. 
Nta.kt exposes the `Views.interval` functions as extensions to the `RandomAccessible` interface (and by extension `RandomAccessibleInterval`).
The `[]` operator is overloaded for `Interval`:
```kotlin
val i1 = ra.interval(1L, 2L)
val i2 = ra.interval(3, 4)
val i3 = ra.interval(longArrayOf(1, 2), longArrayOf(3, 4))
val i4 = ra.interval(intArrayOf(5, 6), intArrayOf(7, 8))
val i5 = ra.interval(i1)
val i6 = ra[i3]
```

Similarly, nta.kt adds extensions to `RealRandomAccessible` (and by extension `RealRandomAccessibleRealInterval`):
```kotlin
val ri1: RealRandomAccessibleRealInterval<T> = rra.realInterval(1F, 2F)
val ri2: RealRandomAccessibleRealInterval<T> = rra.realInterval(3.0, 4.0)
val ri3: RealRandomAccessibleRealInterval<T> = rra.realInterval(doubleArrayOf(1.0, 2.0), doubleArrayOf(3.0, 4.0))
val ri4: RealRandomAccessibleRealInterval<T> = rra.realInterval(floatArrayOf(5F, 6F), floatArrayOf(7F, 4F))
val ri5: RealRandomAccessibleRealInterval<T> = rra.realInterval(ri1)
val ri6: RealRandomAccessibleRealInterval<T> = rra[ri3]
```


### Caveats
 - Kotlin extension functions are just syntactic sugar for static Java methods. Interface methods take precedence, if they exist. As a result, nta.kt code may fail to compile or, even worse, change behavior silently when interface methods are added upstream.
 - Some of the added convenience functions are inefficient, which is not obvious without understanding the ImgLib2 design.
 - It is not always obvious (and not currently documented) which (extension) functions genearate views and which allocate data
 - It is not always obvious (and not currently documented) which (extension) functinos generate read-only views and which generate read-write views

## Installation

At this time, nta.kt is not deployed to Maven repositories
but we plan to make nta.kt available through the [SciJava public repository](http://maven.scijava.org/). 
Until then, nta.kt is available through [JitPack](https://jitpack.io/#org.ntakt/ntakt).
The [JitPack landing page](https://jitpack.io/) has instructions for adding the repository for popular Java build tools.

**Note**: JitPack builds artifacts on demand.
Expect some delay if a specific version is requested for the first time.
The build time for nta.kt on a decent laptop is about three minutes.

To track the latest development branch, add the dependency
```
org.ntakt:ntakt:main-SNAPSHOT
```
to your build file. Replace the `main-SNAPSHOT` version with any of these valid tags:
 - git commit hash, e.g. `741696bcc1` (recommended for reproducible builds)
 - git tags, e.g. `example-tag` (recommended for reproducible builds)
 - latest commit on a git branch: `${BRANCH_NAME}-SNAPSHOT`

For reproducible builds, commit hash or tag are recommended.

Alternatively, nta.kt can be built locally from source with Java 8 or later.
To install into your local Maven repository (typically `~/.m2/repository`), run from the root of the repository:
```shell script
./gradlew clean build publishToMavenLocal
```
To include ntakt as a dependency:
 - Maven (`pom.xml`):
   ```xml
   <dependency>
     <groupId>org.ntakt</groupId>
     <artifactId>ntakt</artifactId>
     <version>0.1.0-SNAPSHOT</version>
   </dependency>
   ``` 
 - Gradle
   ```
   "org.ntakt:ntakt:0.1.0-SNAPSHOT"
   ```
 - [`kotlin-jupyter`](https://github.com/Kotlin/kotlin-jupyter)
   ```
   @file:DependsOn("org.ntakt.ntakt:0.1.0-SNAPSHOT")
   ```
The [`kotlin-jupyter` kernel](https://github.com/Kotlin/kotlin-jupyter) is required to run the [notebooks](notebooks/examples).

Installation has been tested on Manjaro Linux and the notebooks have been tested on Manjaro Linux and Windows 10.

### Installation into Fiji/Script Interpreter
**Experimental**: nta.kt can be used from within the Fiji script interpreter but this is an experimental feature and installation involves multiple steps. First, [install](#Installation) nta.kt into your local Maven repository. Then, follow these instructions for Linux command line. They should easily translate to macOS command line and possibly to Windows command line as well. Adjust paths as needed:
 1. Download a fresh Fiji from [fiji.sc](https://fiji.sc)
 2. Unzip (this will create a `Fiji.app` directory within your current working directory)
    ```
    unzip /path/to/fiji-linux64.zip
    ```
 3. Clone the SciJava Kotlin scripting plugin, navigate to the repository, and install to unzipped `Fiji.app`:
    ```shell
    git clone https://github.com/scijava/scripting-kotlin
    cd scripting-kotlin
    mvn -Dscijava.app.directory=../Fiji.app # replace with path to Fiji.app as needed
    ```
  4. Navigate to `Fiji.app` dir 
     ```
     cd ../Fiji.app
     ```
     and copy the nta.kt jar from your local Maven repository into the `jars` directory (follow [these instructions to install ntakt into your local Maven repository](#Installation)):
     ```
     cp ~/.m2/repository/org/ntakt/ntakt/0.1.0-SNAPSHOT/ntakt-0.1.0-SNAPSHOT.jar jars/
     ```
  5. Start Fiji
     ```
     ./ImageJ-linux64
     ```
  6. Open the script interpreter and run the following commands to confirm that it all worked:
     Change language to Kotlin
     ```
     :lang kotlin
     ```
     Run test script
     ```kotlin
     import org.ntakt.*
     val img = ntakt.ints(300, 200) { it }
     ui.show(img)
     ```
     
        
 
This procedure has been tested on Manjaro Linux with a fresh Fiji download on Monday, Dec 21, 22:50 EST.
   
## Usage

To use nta.kt in your code, simply
```kotlin
import org.ntakt.*
```
to include all extensions and utility objects. The [notebooks](notebooks/examples) provide detailed usage examples but are currently still WIP, as is the API documentation.


## Contribute

Nta.kt follows [conventional commits](https://www.conventionalcommits.org/) to auto-generate a meaningful changelog.


### Releases
Nta.kt uses [GitHub Actions](https://github.com/features/actions) for CI/CD.
This allows for a stream-lined release process with the `gradle.properties` file as single source of truth for the release version. Most of the release process is automated:
 1. Create a [release request issue](https://github.com/saalfeldlab/ntakt/issues/new?assignees=&labels=release+request&template=request-release.md&title=%5BRELEASE%5D), e.g. [saalfeldlab/ntakt#37](https://github.com/saalfeldlab/ntakt/issues/37)
 2. The issue triggers a pull request (PR) with two commits, e.g. [saalfeldlab/ntakt#38](https://github.com/saalfeldlab/ntakt/issues/38), and is closed right after creation:
    1. Set version in `gradle.properties` to non-`SNAPSHOT` (currently, it just removes `-SNAPSHOT` but it should not be too hard to infer new version from commit history or have an optional parameter for the release request issue)
    2. Bump to next development cycle: Increment patch version and add `-SNAPSHOT`.
 3. **Rebase merge the PR into the main branch to trigger release. Automatic releases will not work with any other merge options than rebase merge** (see the following steps for details).
 4. On any push (that includes PR merge) to main branch, a GitHub action checks
    - if the commit message indicates bump to next development cycle, and
    - if the parent commit (`HEAD^`) has a non-`SNAPSHOT` version in `gradle.properties`.
    If both conditions are fulfilled, a release is created for `HEAD^` with the version in `gradle.properties`.

There are two major issues that I see here:
 1. There is no way to restrict the merge option of a PR to only rebase based on the tag or some other information.
    It is thus the responsibility of the maintainer to be diligent and pick the right option
    if the repository allows for other merge options than rebase merge.
 2. How to handle changes to main branch after release request has been created? Probably one of those two options:
    - Close the PR with GitHub actions
    - Re-generate the PR commits from current main on request in a comment in the PR
