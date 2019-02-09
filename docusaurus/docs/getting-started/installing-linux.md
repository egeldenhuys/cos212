---
id: installing-linux
title: Installing Linux
---

This guide will walk you through installing Fedora 29 and setting up a development environment.
for Java.

While you can use Windows/Mac, all guides and resources will be aimed at Fedora/Linux.

## Installing Fedora
### Virtual Machine

This is the quickest way to get started without risk of data loss, but requires a decent computer
for a pleasant experience.

1. Download a Fedora Workstation ISO from https://getfedora.org/en/
    1. There are alternative desktop environments available at https://spins.fedoraproject.org/
    2. [Cinnamon](https://spins.fedoraproject.org/en/cinnamon/) is the closest to the Windows experience but is more resource intensive than LXDE
    3. [LXDE](https://spins.fedoraproject.org/en/lxde/) is a less attractive (in my opinion) but also a "less resource hungry" Desktop Environment
2. Download and install [VirtualBox](https://www.virtualbox.org/wiki/Downloads)
3. [Install Fedora as a VirtualBox Guest](https://fedoramagazine.org/install-fedora-virtualbox-guest/)
    1. After creating the virtual machine you may want to increase the amount of processors allocated by going to `Settings > System > Processor`
    2. Guest additions should be installed already (Try `sudo dnf update`)
4. It might be a good idea to take a snapshot of your fresh VM at this point. (Optional)

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
```sh
sudo dnf update
```

### Install Zsh
[Zsh](https://wiki.archlinux.org/index.php/zsh) is similar to bash but has better tab completion and globbing.

Install zsh:
```sh
sudo dnf install zsh
```

Change the default shell:
```sh
chsh --shell /bin/zsh <user>
```

Download config for zsh:
```sh
curl https://raw.githubusercontent.com/egeldenhuys/cos212/master/dotfiles/zshrc --output ~/.zshrc
curl https://raw.githubusercontent.com/egeldenhuys/cos212/master/dotfiles/zshrc.local --output ~/.zshrc.local
```

Log out and back in for changes to take effect.
