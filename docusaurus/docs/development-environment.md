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
- [Visual Studio Code](https://code.visualstudio.com/) is a flexible editor with Extensions for most major languages.
- [IntelliJ](https://www.jetbrains.com/idea/) has better debugging features out of the box but is limited to Java.

I will be using VSCode.

https://code.visualstudio.com/docs/setup/linux :
```sh
sudo rpm --import https://packages.microsoft.com/keys/microsoft.asc
sudo sh -c 'echo -e "[code]\nname=Visual Studio Code\nbaseurl=https://packages.microsoft.com/yumrepos/vscode\nenabled=1\ngpgcheck=1\ngpgkey=https://packages.microsoft.com/keys/microsoft.asc" > /etc/yum.repos.d/vscode.repo'

dnf check-update
sudo dnf install code
```

VSCode can now be opened by running `code` from the terminal.

### Extensions
Without extensions VSCode is just a good text editor. With extensions it can be turned into an IDE.

```sh
# Java Extension Pack:
code --install-extension vscjava.vscode-java-pack

# Spell Checker
code --install-extension streetsidesoftware.code-spell-checker
```
