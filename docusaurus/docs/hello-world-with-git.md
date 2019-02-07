---
id: hello-world-with-git
title: Hello World with Git
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
    1. Contents:
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
6. Create a new commit with your Hello World code
    1. `git add -all`
    2. `git commit --message "Hello World"`
7. Push your code to GitHub
    1. `git push origin master`


## Hello World in IntelliJ IDEA with Unit Testing

IntelliJ works best when used with [Maven](https://maven.apache.org/) or [Gradle](https://gradle.org/).
I will be using Gradle since I know more about it.

[TestNG](https://testng.org/doc/index.html) will be used for writing unit tests.
Setting up TestNG can be a daunting task if you are not familiar with Java and Gradle, so to spare you time
I have made a scaffold that works out of the box with Gradle.
[cos212-prac-scaffold](https://github.com/egeldenhuys/cos212-prac-scaffold) can be found on GitHub.


1. Download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/)
2. Create a directory for the scaffold
    1. `mkdir ~/github/hello-world-test`
3. Download the scaffold archive
    1. `curl --location https://github.com/egeldenhuys/cos212-prac-scaffold/archive/master.tar.gz --output /tmp/master.tar.gz`
    2. `--location` - Follow redirects
4. Extract the archive
    1. `tar --extract --file /tmp/master.tar.gz --directory hello-world --strip-components 1`
    2. `--strip-components 1` will remove the first component in the path of the file that is being extracted.
    For example `/cos212-prac-scaffold/README.md` will be extracted to `README.md` instead of `/cos212-prac-scaffold/README.md`
5. Open `~/github/hello-world-test` with IntelliJ
6. To be continued...
