#filter package name:
com.supercell.clashofclans #COC
com.android.vending #google play store
com.google.android.gms #google play service

#modified archive
src/main/res/xml/pre_all.xml #when launch this app firstly,all the default configurations are repleaced by hints
src/main/scala/com/github/shadowsocks/AppManager.scala #filter some apps,set the bypass item invalid
src/main/scala/com/github/shadowsocks/shadowsocks.scala #change the vps server, set all the items except auto-launch invalid
src/main/scala/com/github/shadowsocks/database/Profile.scala #change the vps server

check //TODOs  to find more details
