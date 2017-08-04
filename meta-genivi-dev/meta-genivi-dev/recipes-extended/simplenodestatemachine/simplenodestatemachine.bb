# Copyright (C) 2017 GENIVI Alliance

LICENSE  = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=815ca599c9df247a0c7f619bab123dad"
SRC_URI = "git://github.com/GENIVI/simple-node-state-machine"
SRCREV  = "48ed52eb2346849e26b69e74bfc2123bba1b1d27"

INSANE_SKIP_${PN} += "dev-so"

PACKAGES = "${PN} ${PN}-dbg"

SUMMARY = "Simple Node State Machine"
DEPENDS = "ivi-logging node-state-manager glibmm"

S = "${WORKDIR}/git"

FILES_${PN} += "${libdir}/*.so"

inherit cmake
