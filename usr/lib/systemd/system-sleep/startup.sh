#!/bin/sh

username=orschiro  # add your username here, i.e.: username=foobar

USERHOME=/home/$username
export XAUTHORITY="$USERHOME/.Xauthority"
export DISPLAY=":0"

case $1/$2 in
    post/*)
	echo "Resuming and running startup script..."
	/home/orschiro/.startup
	;;
esac
