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

