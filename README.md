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