# Introduction
This repository features most of my Arch Linux / Cinnarch system which I use on a daily basis on a Thinkpad X200T. The subdirectory `Packages/` mostly contains packages for Arch Linux, some of which are published on [AUR](https://aur.archlinux.org/packages/?SeB=m&K=orschiro). Apart from my custom user dotfiles you find additional configuration files in the `Backup/` folder. Much of them are used for powersaving features on my Thinkpad X200T. These config files are versatile and can be used on other laptops alike. Finally, `Scripts/` contains some useful scripts that are too long to include them into my .bashrc.

# Config files description
## Backup/etc/udev/rules.d/51-powersaving.rules
Changes brightness according to the AC state. That is, when the laptop is running on battery, screen brightness is reduced. Otherwise brightness ist set to maximum. You have to use it together with the powersaving script which is located in `/home/scripts/`. 
## Backup/etc/systemd/system/autostart-boot-resume.service
Run custom user autostart script located in `/home/scripts/` on boot and resume from suspension and hibernation. This is necessary since Gnome 3 overwrites your settings settings with default settings such as for the keyboard layouts. 
## Backup/etc/tmpfiles.d/disable-bluetooth.conf
This file will disable the bluetooth module on boot. Again you will have to modify the path to your bluetooth module
## Backup/etc/tmpfiles.d/disable-nmi-watchdog.conf
It is usually safe to disable the nmi_watchdog which can cause frequent interrupts. 
## Backup/etc/fstab
This file might only be of interest for you if you want to see an example how to mount internal windows partition with linux compatible permissions, i.e. 755 for directories (dmask=022) and 644 for files (fmask=133).

# Scripts/
## Scripts/powersaving
This is a simple case query which is run by the udev rule above. You may have to adapt the correct path and value of your brightness class.
## Scripts/autostart
Sets the keyboard layout. Reasons for doing so is explained for the next file.