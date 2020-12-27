[![Build Status](https://travis-ci.com/saalfeldlab/imklib2.svg?branch=master)](https://travis-ci.com/saalfeldlab/imklib2) [![Build status](https://ci.appveyor.com/api/projects/status/cvi9r5hqyiiyenlu?svg=true)](https://ci.appveyor.com/project/hanslovsky/imklib2)


# imklib (preliminary name)

imklib (preliminary name) combines the expressive power and flexibility of the Java image processing library [ImgLib2](https://github.com/imglib/imglib2) with the convenience and clarity that Kotlin operators provide. Internally, imklib uses Kotlin extension functions to add operator overloading and other convenience functions that would otherwise not be possible in Java. The result is a very concise and intuitive syntax that users are familiar with from other scientific computing libraries such as [NumPy](https://numpy.org) in the [Python](https://www.python.org) world. For example, this is the Java code to multiply two images in ImgLib2:

``` java
// populate data
final RandomAccessibleInterval<DoubleType> img1 = ArrayImgs.doubles(2, 3);
Views.iterable(img1).forEach(p -> p.setReal(0.1));
final RandomAccessibleInterval<LongType> img2 = ArrayImgs.longs(2, 3);
final Cursor<LongType> cursor = Views.flatIterable(img2).cursor();
for (int i = 1; cursor.hasNext(); ++i)
    cursor.next().setInteger(i);

// multiply images
final RandomAccessibleInterval<DoubleType> img3 = Converters.convert(
        img1,
        img2,
        (t, u, v) -> { v.setReal(u.getRealDouble()); v.mul(t); },
        new DoubleType());
Views.flatIterable(img3).forEach(System.out::println);

```

This is the equivalent in imklib:

``` kotlin
// populate data
val img1 = imklib.doubles(2L, 3L) { 0.1 }
val img2 = imklib.longs(2L, 3L) { it + 1L }
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

We created imklib to make ImgLib2 more convenient to use and accessible to users who are not ImgLib2 experts (yet) while still maintaining its flexibility and efficiency. 
We picked Kotlin as a language because
 - operators can be [overloaded](https://kotlinlang.org/docs/reference/operator-overloading.html), e.g. `+`, `-`, `*`, `/`, for artbitrary types,
 - ImgLib2 interfaces can be extended with Kotlin [extension functions](https://kotlinlang.org/docs/reference/extensions.html) without the need for new wrapper classes, and
 - Kotlin code is compiled to the JVM. When a user's needs cannot be met completely by imklib, they can always implement the missing parts using ImgLib2 in Kotlin.
 
### Core Concepts
Kotlin extension functions allow us to easily add new features and convenience methods to existing interfaces and classes.
For example,
```kotlin
fun String.hello() = "Hello, $this!"
println("imklib".hello())
```
prints
```
Hello, imklib!
```
to the console. In a similar way, imklib extends ImgLib2 interfaces.
Many of the extensions exist already inside ImgLib2 core in namespace classes like `Views` or `Converters`
but interface or class methods (and extension functions) are more accessible through the auto-completion of any modern IDE.
For example, the Java code
```java
final RandomAccessibleInterval rai = ...
Converters.convert(...)
```
translates to
```
val rai = ...
rai.convert(...)
```
in imklib. In combination with operator overloading, imklib adds arithmetic operators to existing ImgLib2 interfaces, e.g.
```kotlin
val rai1: RAI<DoubleType> = ...
val rai2: RAI<DoubleType> = ...
val rai3 = rai1 + rai2
val rai4 = rai3 / 3.14
```
imklib adds operators for `+`, `-`, `*`, and `/`. The [notebooks](notebooks/examples) provide more detailed examples. 

#### Extension Functions
imklib adds convenience to ImgLib2 data structures with extensions functions.
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
val rai = imklib.doubles(1L, 2L, 3L) { Random.nextDouble(0.0, 1.0) }
val scaledAndQuantizedRai = rai.convert(imklib.types.unsignedByte) { s, t -> t.setInteger(round(255.0 * s.realDouble).toInt()) }

val rra1 = imklib.function(2, { imklib.types.float }) { p, t -> t.setReal(abs(p.getDoublePosition(0)) + abs(p.getDoublePosition(1))) }
val rra2 = imklib.function(2, { imklib.types.double }) { p, t -> t.setReal(sqrt(p.getDoublePosition(0).pow(2.0) + p.getDoublePosition(1).pow(2.0))) }
val meanRra = rra1.convert(rra2, imklib.types.double) { s, t, u -> u.setReal(s.realDouble); u.add(t); u.mul(0.5) }
```

Note that for expensive operations, it may be beneficial to persist/materialize views to avoid repeated execution of the expensive operation.
Many of the other convenience functions are implemented as converters, e.g. the [arithmetic operators](#arithmetic-operators). 

#### Other Convenience Functions
*TBD*

##### Arithmetic Operators
Operator overloading is possible for arithmetic operations (`+-*/`) on 
 1. ImgLib2 data structures and primitive types and generic types with the same bounds as the data structure
 2. Pairs of ImgLib2 data structures if
    1. Both data structures have the exact same generic bounds `T`. The return type is `T`.
    2. The generic type is any of `imklib.types.realTypes` for each of the data structures. The return type is defined in the table below.
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

**Note**: This access pattern is designed for convenience but is not very efficient. Use in tight loop is discouraged.
For efficient access of (large numbers of) individual voxels, use ImgLib2 `Cursor`, `RandomAccess`, or `LoopBuilder`.

##### Intervals
It is common practice to restrict unbounded `RandomAccessible` instances to certain intervals, e.g. when cropping a block out of a function defined on infinite domain. 
imklib exposes the `Views.interval` functions as extensions to the `RandomAccessible` interface (and by extension `RandomAccessibleInterval`).
The `[]` operator is overloaded for `Interval`:
```kotlin
val i1 = ra.interval(1L, 2L)
val i2 = ra.interval(3, 4)
val i3 = ra.interval(longArrayOf(1, 2), longArrayOf(3, 4))
val i4 = ra.interval(intArrayOf(5, 6), intArrayOf(7, 8))
val i5 = ra.interval(i1)
val i6 = ra[i3]
```

Similarly, imklib adds extension to `RealRandomAccessible` (and by extension `RealRandomAccessibleRealInterval`):
```kotlin
val ri1: RealRandomAccessibleRealInterval<T> = rra.realInterval(1F, 2F)
val ri2: RealRandomAccessibleRealInterval<T> = rra.realInterval(3.0, 4.0)
val ri3: RealRandomAccessibleRealInterval<T> = rra.realInterval(doubleArrayOf(1.0, 2.0), doubleArrayOf(3.0, 4.0))
val ri4: RealRandomAccessibleRealInterval<T> = rra.realInterval(floatArrayOf(5F, 6F), floatArrayOf(7F, 4F))
val ri5: RealRandomAccessibleRealInterval<T> = rra.realInterval(ri1)
val ri6: RealRandomAccessibleRealInterval<T> = rra[ri3]
```


### Caveats
 - Kotlin extension functions are just syntactic sugar for static Java methods. Interface methods take precedence, if they exist. As a result, imklib code may fail to compile or, even worse, change behavior silently when interface methods are added upstream.
 - Some of the added convenience functions are inefficient, which is not obvious without understanding the ImgLib2 design.
 - It is not always obvious (and not currently documented) which (extension) functions genearate views and which allocate data
 - It is not always obvious (and not currently documented) which (extension) functinos generate read-only views and which generate read-write views

## Installation

Installation requires Java 8. Currently, imklib is not available through remote Maven repositories (it is on the roadmap).
To install into your local maven repository (typically `~/.m2/repository`), run from the root of the repository:
```shell script
./gradlew clean build publishToMavenLocal
```
To include imklib as a dependency:
 - Maven (`pom.xml`):
   ```xml
   <dependency>
     <groupId>net.imglib2</groupId>
     <artifactId>imklib2</artifactId>
     <version>0.1.0-SNAPSHOT</version>
   </dependency>
   ``` 
 - Gradle
   ```
   "net.imglib2:imklib2:0.1.0-SNAPSHOT"
   ```
 - [`kotlin-jupyter`](https://github.com/Kotlin/kotlin-jupyter)
   ```
   @file:DependsOn("net.imglib2:imklib2:0.1.0-SNAPSHOT")
   ```
The [`kotlin-jupyter` kernel](https://github.com/Kotlin/kotlin-jupyter) is required to run the [notebooks](notebooks/examples).

Installation has been tested on Manjaro Linux and the notebooks have been tested on Manjaro Linux and Windows 10.

### Installation into Fiji/Script Interpreter
**Experimental**: imklib can be used from within the Fiji script interpreter but this is an experimental feature and installation involves multiple steps. First, [install](#Installation) imklib into your local Maven repository. Then, follow these instructions for Linux command line. They should easily translate to macOS command line and possibly to Windows command line as well. Adjust paths as needed:
 1. Download a fresh Fiji from [fiji.sc](https://fiji.sc)
 2. Unzip (this will create a `Fiji.app` directory within your current working directory)
    ```
    unzip /path/to/fiji-linux64.zip
    ```
 3. Checkout the [`fix-kotlin-engine` branch](https://github.com/scijava/scripting-kotlin/tree/fix-kotlin-engine) of the SciJava Kotlin scripting plugin, navigate to the repository, and install to unzipped `Fiji.app`:
    ```
    git clone https://github.com/scijava/scripting-kotlin
    cd scripting-kotlin
    git switch fix-kotlin-engine
    mvn -Dscijava.app.directory=../Fiji.app
    ```
  4. Navigate to `Fiji.app` dir 
     ```
     cd ../Fiji.app
     ```
     and install additional jars:
     1. Copy JetBrains' Trove fork from your local Maven repository into the `jars` directory. To make sure that Fiji includes both the original Trove jar and the JetBrains Trove jar, rename the JetBrains Trove jar. **WARNING**: This may have unintended side effects on your Fiji installation.
        ```
        cp ~/.m2/repository/org/jetbrains/intellij/deps/trove4j/1.0.20181211/trove4j-1.0.20181211.jar jars/jetbrains-trove4j-1.0.20181211.jar
        ```
     2. Copy the imklib jar from your local Maven repository into the `jars` directory (follow [these instructions to install imklib into your local Maven repository](#Installation)):
        ```
        cp ~/.m2/repository/net/imglib2/imklib2/0.1.0-SNAPSHOT/imklib2-0.1.0-SNAPSHOT.jar jars/
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
     import net.imglib2.imklib.*
     val img = imklib.ints(300, 200) { it }
     ui.show(img)
     ```
     
        
 
This procedure has been tested on Manjaro Linux with a fresh Fiji download on Monday, Dec 21, 22:50 EST.
   
## Usage

To use imklib in your code, simply
```kotlin
import net.imglib2.imklib.*
```
to include all extensions and utility objects. The [notebooks](notebooks/examples) provide detailed usage examples but are currently still WIP, as is the API documentation. 
