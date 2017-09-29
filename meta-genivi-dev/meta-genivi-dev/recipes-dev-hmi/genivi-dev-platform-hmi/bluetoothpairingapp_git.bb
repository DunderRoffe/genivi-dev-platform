# Copyright (C) 2017 GENIVI Alliance
# Released under the MIT license (see LICENSE for the terms)

DESCRIPTION = "Application used to pair bluetooth devices"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

DEPENDS = "qtbase qtdeclarative"

RDEPENDS_${PN} = "blueconnect"

inherit qmake5

SRC_URI = "git://github.com/dunderroffe/bluetoothPairingApp;branch=master"
SRCREV = "ad09140f7fb2ce3056a3827729bc833fbb485e8f"

S = "${WORKDIR}/git"

APP = "com.genivi.gdp.bluetoothPairingApp"
EXE = "bluetoothPairingApp"

include hmi-application-installation.inc
