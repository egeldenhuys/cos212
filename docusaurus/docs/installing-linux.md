---
id: installing-linux
title: Installing Linux
---

This guide will walk you through installing Fedora 29 and setting up a development envrionment
for Java.

While you can use Windows/Mac, all guides and resources will be aimed at Fedora/Linux.
Personally I find development much easier on Linux.

## Installing Fedora
### Dual Boot with Windows

This is the recommended setup if you still need Windows.
If Windows is installed first then the setup is usually without problems.

#### Further Reading
- [Dual boot with Windows - wiki.archlinux.org](https://wiki.archlinux.org/index.php/Dual_boot_with_Windows)

### Virtual Machine

This is the quickest way to get started without risk of data loss, but requires a decent computer
for a pleasant experience.

1. Download a Fedora Workstation ISO from https://getfedora.org/en/
    1. There are alternative desktop enviroments available at https://spins.fedoraproject.org/
    2. [Cinnamon](https://spins.fedoraproject.org/en/cinnamon/) is the closest to the Windows experience but is more resource intensive than LXDE
    3. [LXDE](https://spins.fedoraproject.org/en/lxde/) is a less attractive (in my opinion) but also a "less resource hungry" Desktop Environment
2. Download and install [VirtualBox](https://www.virtualbox.org/wiki/Downloads)
3. [Install Fedora as a VirtualBox Guest](https://fedoramagazine.org/install-fedora-virtualbox-guest/)
    1. After creating the virtual machine you may want to increate the amount of processors allocated by going to `Settings > System > Processor`

## Post Installation Setup
### Add user to sudoers file
Future resources will assume your user can use [sudo](https://wiki.archlinux.org/index.php/sudo)
1. Add user to `wheel` group. By default users in the `wheel` group can use sudo.
    ```sh
    su root
    usermod --append --groups wheel <user>
    ```
2. Restart for changes to take effect

### Update
```
sudo dnf update
```