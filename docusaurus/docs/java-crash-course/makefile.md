---
id: makefile
title: Makefile
---

Below is a simple Makefile that will compile all `.java` files in the current directory and execute the `Main` class.
Due to its flexibility (no need to define which classes to compile), it is not efficient - it will recompile everything on each run.
You can of course optimise the the Makefile to suit your needs.

**EDIT (2019-02-12): The Makefile should be indented with TABs not spaces. Do not copy and paste straight from this webpage since it contains spaces. [Download the Makefile instead](/files/Makefile)**


```makefile
default:
	javac *.java

run:
	java Main

clean:
	rm *.class
```
[Download Makefile](/files/Makefile)

#### Usage
Compile:
```sh
make
```

Run:
```sh
make run
```