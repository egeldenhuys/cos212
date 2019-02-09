---
id: hello-world
title: Hello World
---

## Hello World
A good place to start and test the Java Installation is with the classic Hello World.

### Main.java
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Some things to note:
- Unlike C++, there are no header files. `Main.java` contains your class and method definitions.
- The file name has to match the class name.
- Only one class can be defined in the file.

TODO:
- void?
- arg types?
- public?
- static?
- makefile?

### Compiling
Once [Java](https://www.oracle.com/technetwork/java/javase/downloads/index.html) and [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html) have been installed Java programs can be compiled using `javac`

```md
man javac

NAME
       javac - Reads Java class and interface definitions and compiles them
       into bytecode and class files.

SYNOPSIS
       javac [ options ] [ sourcefiles ] [ classes] [ @argfiles ]
```

#### Examples:
Explicitly list java source files to compile
```sh
javac Main.java 
```

Compile all `.java` files in the current directory
```sh
javac *.java
```

This will generate `.class` files in the current directory.
These can be executed using the `java` command, if they contain a 
```java
public static void main(String[] args)
```
method.

### Running
The `java` command is used to run `.class` files that have a `main` method.

```md
man java

NAME
        java - Launches a Java application.

SYNOPSIS
        java [options] classname [args]
```

#### Examples
```sh
java Main
```

Which will output

```md
Hello, World!
```