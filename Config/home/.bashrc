#
# ~/.bashrc
#

# If not running interactively, don't do anything
[[ $- != *i* ]] && return

alias ls='ls -la --color=auto'

PS1='[\u@\h \W]\$ '

# Enable the following to remove all files except with the pattern rm !(except_file1|except_file2)
# See also http://superuser.com/questions/231718/remove-all-files-except-for-a-few-from-a-folder-in-unix
shopt -s extglob

# Convert videos for YouTube
# See also https://bbs.archlinux.org/viewtopic.php?pid=1200542#p1200542
youtubeConvert()
{
ffmpeg -i $1 -c:v libx264 -crf 18 -preset slow -pix_fmt yuv420p -c:a copy $2.mkv
}
alias ytconvert=youtubeConvert

# Prezi
preziDesktop()
{
sudo date --set="26 February 2012"
prezi-desktop 
sleep 30
sudo ntpd -q -g
}
#alias prezi-desktop=preziDesktop

# Fix line wrap on window resize
shopt -s checkwinsize

# Quick path for internal Windows partition
linux=/run/media/orschiro/data/Users/Robert/Linux

# Yaourt and pacman 
alias update='yaourt -Syua'
alias updatevcs='yaourt -Syua --devel'
alias orphans='sudo pacman -Rs $(pacman -Qtdq)'

# Font update
alias fontupdate='fc-cache -vf'
