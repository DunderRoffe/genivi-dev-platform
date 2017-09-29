# Copyright (C) 2015-2016 GENIVI Alliance
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE  = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=815ca599c9df247a0c7f619bab123dad"
SRC_URI = "git://github.com/genivi/FMRadio"
SRCREV  = "7d30d07884921affc89901185db2ef743fb41909"

SUMMARY = "FM Radio"
DEPENDS = "qtbase qtdeclarative"
RDEPENDS_${PN} = "qtquickcontrols-qmlplugins bubblewrap"

S = "${WORKDIR}/git"

inherit qmake5

APP = "com.genivi.gdp.${PN}"
EXE = "fm-radio-app"

include hmi-application-installation.inc
