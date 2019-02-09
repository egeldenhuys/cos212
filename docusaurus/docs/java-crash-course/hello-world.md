---
id: hello-world
title: Hello World
---

The structure of this crash course was borrowed from [learnjavaonline.org](https://www.learnjavaonline.org/)


A good place to start and test the Java Installation is with the classic Hello World.

## Main.java
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Compiling and running the above code will output `Hello, World!`.

Lets analyse the parts of the code.

```java
public class Main {...
```
- Defines a class with the name `Main`.
- The name of source file has to match the name of the class defined in it. In this case it is `Main.java`.
- Only one class can be defined per source file.
- Methods can only be defined in a class.
- Statements can only be written in a class definition.
- Unlike C++, there are no header files. One source file will contain your class and method definitions.
- `public` indicates the class is accessible from other Java Packages. In the context of COS 212 only `public class` will be used.

```java
public static void main(String[] args) {...
```
- This is the entry point for our program. The signature has to match exactly as above.
- The Access Level Modifier `public` specifies that the method is visible to all classes.
    - `private` specifies that is is accessible only within the class.
- `static` specifies that the method can be called without instantiating an instance of the class.
    - i.e `Main.main()`
- `void` specifies that the method returns no value.
- `String[]` is the type for an array of `Strings`. We will go over the different types soon.
- `args` will contain the command line arguments used to start the program.

```java
System.out.println("Hello, World!");
```
- `System` is a Java class providing useful class fields and methods.
- `out` is a static member variable that represents the "standard" output stream.
- `println` is a method of `out` that prints the given string along with a new line character.
