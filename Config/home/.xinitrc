#!/bin/sh
#
# ~/.xinitrc
#
# Executed by startx (run your window manager from here)

if [ -d /etc/X11/xinit/xinitrc.d ]; then
  for f in /etc/X11/xinit/xinitrc.d/*; do
    [ -x "$f" ] && . "$f"
  done
  unset f
fi

# Set the $BROWSER variable such as required by Dropbox
if [ -n "$DISPLAY" ]; then
     export BROWSER=chromium
fi 

# Default editor is Sublime Text 2
export EDITOR=subl

# Set correct GTK2 theme for skype
export GTK2_RC_FILES="/etc/gtk-2.0/gtkrc:$HOME/.gtkrc-2.0"

# Allows to access USB drives from within a VirtualBox guest
VBOX_USB=usbfs

# exec gnome-session
# exec startkde
# exec startxfce4
# ...or the Window Manager of your choice

exec gnome-session-cinnamon
