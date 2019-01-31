---
id: development-environment
title: Development Environment
---

This document assumes you are running a new install of Fedora 29.
The instructions here are aimed at installations, usage will be described later.

## Java (JRE and JDK)
- https://fedoraproject.org/wiki/Java
- https://docs.fedoraproject.org/en-US/quick-docs/installing-java/

```sh
sudo dnf install java-1.8.0-openjdk java-1.8.0-openjdk-devel
```

## Visual Studio Code
[Visual Studio Code](https://code.visualstudio.com/) is a flexible editor with Extensions for most major languages.
[IntelliJ](https://www.jetbrains.com/idea/) works better out of the box but is limited to Java. Last I checked the debugging features
of IntelliJ are better than vscode.

- https://code.visualstudio.com/docs/setup/linux

```sh
sudo rpm --import https://packages.microsoft.com/keys/microsoft.asc
sudo sh -c 'echo -e "[code]\nname=Visual Studio Code\nbaseurl=https://packages.microsoft.com/yumrepos/vscode\nenabled=1\ngpgcheck=1\ngpgkey=https://packages.microsoft.com/keys/microsoft.asc" > /etc/yum.repos.d/vscode.repo'

dnf check-update
sudo dnf install code
```

VSCode can now be opened by running `code` from the terminal.

### Install vscode Extensions
- Java Extension Pack (`vscjava.vscode-java-pack`)

## Git
[Git](https://en.wikipedia.org/wiki/Git) is a distributed version control system for tracking changes in source code during software development - Wikipedia.

If used correctly Git and GitHub will provide you with the following:
- Ability to revert to the previous version of code that worked.
- Backup of your source code in case of user error or hardware failure.
- Easily clone your source code on another machine to continue working.
- Collaboration for non COS 212 related projects.
- Less headaches (after you learn the basics of Git)

So go ahead and install git:
```
sudo dnf install git
```

We will look at git closer in a future document.

### GitHub
To make full use of git, you need a [GitHub](https://github.com/) account.
GitHub now provides free private repositories!

#### Example Usage
1. Create a PRIVATE repository named `cos212`
2. For each prac/assignment create a new folder in the repository
3. Keep repositories in `~/github`

This way all related things are stored together and easy to find.

### 