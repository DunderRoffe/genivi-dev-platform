# Copyright (C) 2015-2016 GENIVI Alliance
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE  = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"
SRC_URI = "git://github.com/GENIVI/connected-home"
SRCREV  = "2847ab9547be807d0767c69b0c0df7c90461fc6e"


SUMMARY = "Connected Home"
DEPENDS = "qtbase qtdeclarative"

S = "${WORKDIR}/git"

inherit qmake5

APP = "com.genivi.gdp.${PN}"
EXE = "qt-smart-demo"

include hmi-application-installation.inc
