# Introduction
This repository features most of my Arch Linux / Cinnarch system which I use on a daily basis on a Thinkpad X200T. The subdirectory `Packages/` mostly contains packages for Arch Linux, some of which are published on [AUR](https://aur.archlinux.org/packages/?SeB=m&K=orschiro). Apart from my custom user dotfiles you find additional configuration files in the `Backup/` folder. Much of them are used for powersaving features on my Thinkpad X200T. These config files are versatile and can be used on other laptops alike. Finally, `Scripts/` contains some useful scripts that are too long to include them into my .bashrc.

# Config files description
## Backup/etc/udev/rules.d/50-powersave.rules
Changes brightness according to the AC state. That is, when the laptop is running on battery, screen brightness is reduced. Otherwise brightness ist set to maximum. You have to use it together with the powersaving script which is located in `/usr/local/bin/` and adapt the `/sys/` path and the brightness values according to your hardware. 
## Backup/etc/tmpfiles.d/disable-bluetooth.conf
This file will disable the bluetooth module on boot. Again you will have to modify the path to your bluetooth module.
## Backup/etc/tmpfiles.d/disable-nmi-watchdog.conf
It is usually safe to disable the nmi_watchdog which can otherwise cause frequent interrupts. 
## Backup/etc/fstab
This file might only be of interest for you if you want to see an example how to mount internal windows partition with linux compatible permissions, i.e. 755 for directories (dmask=022) and 644 for files (fmask=133).

# Scripts
## Backup/usr/local/bin/powersaving
This is a simple case query which is run by the udev rule above. You may have to adapt the correct path and value of your brightness class.
## Backup/usr/local/bin/backup
A rsync script which backs up my complete system to `~/Backup`. This folder is then backed up to the cloud by [Crashplan Backup Software](http://crashplan.com).
## Backup/usr/local/bin/pacman-disowned
Lists all files which are not owned by any package. These so-called "orphans" should be analysed if they are still needed for the system.