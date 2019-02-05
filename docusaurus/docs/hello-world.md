---
id: hello-world
title: Hello World
---

After all the installations and configuration we are ready to create the classic Hello World in Java.
This Hello World will include using git and GitHub.

## Git
Use the [Hello World](https://guides.github.com/activities/hello-world/) tutorial for detailed explanation on the below steps.

1. Create git repository on GitHub
    1. Name it `hello-word`
    2. Initialize with a README
2. Create a folder to keep git repositories on local machine
    1. `mkdir ~/github`
3. Clone the repository from GitHub to your local machine
    1. `cd ~/github`
    2. `git clone https://github.com/<username>/hello-world`

## Hello World in Visual Studio Code
1. Open vscode
    1. `cd ~/github/hello-world`
    2. `code .`
2. Create `Main.java`
    1. Due to the constraints of FitchFork it is best if Project Management Tools such as [Maven](https://maven.apache.org/) and [Gradle](https://gradle.org/) are not used.
    2. Contents:
        ```
            public class Main {
                public static void main(String[] args) {
                    System.out.println("Hello, World!");
                }
            }
        ```
3. Compile and run from terminal
    1. `javac Main.java && java Main`
4. Run the code from vscode
    1. `CTRL + F5` or use `F5` to start a debug session
    2. Verify output in Debug Console
5. If everything worked then your Development Environment has been successfully configured.

## Hello World in IntelliJ IDEA with Unit Testing
