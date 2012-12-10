The subdirectory `Packages/` mostly contains packages for Arch Linux, some of which are published on [AUR](https://aur.archlinux.org/packages/?SeB=m&K=orschiro). The subdirectory `Config` contains all custom dotfiles that I am currently using on my Thinkpad X200T. These config files are versatile and can be used on other laptops alike.

# Config files description
## /etc/power.d/00-brightness
Changes brightness according to the AC state. That is, when the laptop is running on battery, screen brightness is reduced. Otherwise brightness ist set to maximum. You may have to adapt the correct path and value of your brightness class.
## /etc/systemd/system/autostart-boot-resume.service
Run custom user autostart script located in ~/ on boot and resume from suspension and hibernation. This is necessary since Gnome 3 overwrites your settings settings with default settings such as for the keyboard layouts. 
## /etc/tmpfiles.d/disable-bluetooth.conf
This file will disable the bluetooth module on boot. Again you will have to modify the path to your bluetooth module
## /etc/tmpfiles.d/disable-nmi-watchdog.conf
It is usually safe to disable the nmi_watchdog which can cause frequent interrupts. 
## /etc/fstab
This file might only be of interest for you if you want to see an example how to mount internal windows partition with linux compatible permissions, i.e. 755 for directories (dmask=022) and 644 for files (fmask=133).
