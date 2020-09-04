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

#### Convenience Extension Functions
*TBD*

#### Other Convenience Functions
*TBD*

#### Arithmetic Operators
|           ``T`/`U`` |          `ByteType` |         `ShortType` |           `IntType` |          `LongType` |  `UnsignedByteType` | `UnsignedShortType` |   `UnsignedIntType` |  `UnsignedLongType` |         `FloatType` |        `DoubleType` |
| ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- | ------------------- |
|          `ByteType` |          `ByteType` |         `ShortType` |           `IntType` |          `LongType` |         `ShortType` |           `IntType` |          `LongType` |          `LongType` |         `FloatType` |        `DoubleType` |
|         `ShortType` |         `ShortType` |         `ShortType` |           `IntType` |          `LongType` |         `ShortType` |           `IntType` |          `LongType` |          `LongType` |         `FloatType` |        `DoubleType` |
|           `IntType` |           `IntType` |           `IntType` |           `IntType` |          `LongType` |           `IntType` |           `IntType` |          `LongType` |          `LongType` |         `FloatType` |        `DoubleType` |
|          `LongType` |          `LongType` |          `LongType` |          `LongType` |          `LongType` |          `LongType` |          `LongType` |          `LongType` |          `LongType` |         `FloatType` |        `DoubleType` |
|  `UnsignedByteType` |         `ShortType` |         `ShortType` |           `IntType` |          `LongType` |  `UnsignedByteType` | `UnsignedShortType` |   `UnsignedIntType` |  `UnsignedLongType` |         `FloatType` |        `DoubleType` |
| `UnsignedShortType` |           `IntType` |           `IntType` |           `IntType` |          `LongType` | `UnsignedShortType` | `UnsignedShortType` |   `UnsignedIntType` |  `UnsignedLongType` |         `FloatType` |        `DoubleType` |
|   `UnsignedIntType` |          `LongType` |          `LongType` |          `LongType` |          `LongType` |   `UnsignedIntType` |   `UnsignedIntType` |   `UnsignedIntType` |  `UnsignedLongType` |         `FloatType` |        `DoubleType` |
|  `UnsignedLongType` |          `LongType` |          `LongType` |          `LongType` |          `LongType` |  `UnsignedLongType` |  `UnsignedLongType` |  `UnsignedLongType` |  `UnsignedLongType` |         `FloatType` |        `DoubleType` |
|         `FloatType` |         `FloatType` |         `FloatType` |         `FloatType` |         `FloatType` |         `FloatType` |         `FloatType` |         `FloatType` |         `FloatType` |         `FloatType` |        `DoubleType` |
|        `DoubleType` |        `DoubleType` |        `DoubleType` |        `DoubleType` |        `DoubleType` |        `DoubleType` |        `DoubleType` |        `DoubleType` |        `DoubleType` |        `DoubleType` |        `DoubleType` |

*TBD*
*TBD* show all combinations of input and output types

#### Indexed Access Operators
*TBD*


### Caveats
 - Kotlin extension functions are just syntactic sugar for static Java methods. Interface methods take precedence, if they exist. As a result, imklib code may fail to compile or, even worse, change behavior silently when interface methods are added upstream.
 - Some of the added convenience functions are inefficient, which is not obvious without understanding the ImgLib2 design. 

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
   
## Usage

To use imklib in your code, simply
```kotlin
import net.imglib2.imklib.*
```
to include all extensions and utility objects. The [notebooks](notebooks/examples) provide detailed usage examples but are currently still WIP, as is the API documentation. 