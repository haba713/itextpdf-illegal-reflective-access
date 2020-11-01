# itextpdf-illegal-reflective-access

## prerequisites

- openjdk 11
- gradle

## steps for reproducing the warning

```
$ git clone git@github.com:haba713/itextpdf-illegal-reflective-access.git
$ cd itextpdf-illegal-reflective-access/
$ gradle test

> Task :test
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.itextpdf.text.io.ByteBufferRandomAccessSource$1 (file:/home/haba713/.gradle/caches/modules-2/files-2.1/com.itextpdf/itextpdf/5.5.13.2/132a841cf4b14fe64ff236b4156eb4842f9bbc09/itextpdf-5.5.13.2.jar) to method java.nio.DirectByteBuffer.cleaner()
WARNING: Please consider reporting this to the maintainers of com.itextpdf.text.io.ByteBufferRandomAccessSource$1
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
```

## call causing warnings

```java
com.itextpdf.text.FontFactory.registerDirectories();
```

## test class

[FontFactoryTest](src/test/java/com/example/FontFactoryTest.java)
