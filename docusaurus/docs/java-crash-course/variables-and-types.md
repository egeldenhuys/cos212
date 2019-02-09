---
id: variables-and-types
title: Variables and Types
---

| Type    | Size      | Range |
|---------|-----------|-------|
| boolean |  depends  |   true, false
| char    |  2 bytes  |   Unicode characters
| byte    |  1 byte   |   [-128, 127]
| short   |  2 bytes  |   [-32768, 32767]
| int     |  4 bytes  |   [-2147483648, 2147483647]
| long    |  8 bytes  |   [-9223372036854775808, 9223372036854775807]
| float   |  4 bytes  |   [-3.4E38, 3.4E38]
| double  |  8 bytes  |   [-1.7E308, 1.7E308]

Source: Drozdek, A. (2013). Data structures and algorithms in Java. 4th ed. Singapore: CENAGE Learning.

- Unlike C++, Java has a `boolean` type which does not support numeric operations

## Declarations
```
<type> <name>
```

Examples:

```java
int myInt = 5;

boolean myBool = false;

char capitalC = 'C';

// Floating-point literals are 64 bit by default, therefore
// needs to be cast for `float` type
float myFloat = 45.64f;
float myFloat = (float) 46.64;
```

## Wrapper Classes
The above data types are `Primitive Data Types`, they are the only types that are not Objects.

Many classes in the `java.util` package operate on `Objects` such as `Integer` and `Boolean`.
Note that the Java platform will _box_ the primitive type in its wrapper class for you when
a method expects an Object. Similarly it will _unbox_ the Object if a method expects a primitive.
See [Autoboxing and Unboxing](https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html).

There are some cases when you want to use an Object instead of a primitive:
- When converting between numbers and strings
    ```java
    Integer myInt = 5;
    String myString = myInt.toString();

    Integer MyInt = Integer.parseInt("5");
    ```
- When a method expects an Object

Primitive type and corresponding wrapper class:
| Primitive type | Wrapper class |
| -----|-----
| boolean | Boolean
| byte |    Byte
| char |    Character
| float |   Float
| int |     Integer
| long |    Long
| short |   Short
| double |  Double

### Further Reading (Optional)
- [The Number Classes](https://docs.oracle.com/javase/tutorial/java/data/numberclasses.html)
- [Autoboxing and Unboxing](https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html)