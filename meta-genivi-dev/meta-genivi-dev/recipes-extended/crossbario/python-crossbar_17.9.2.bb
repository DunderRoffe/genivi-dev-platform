# Copyright (C) 2017 GENIVI
# SPDX-License-Identifier: MIT

inherit pypi setuptools
include python-crossbario.inc

SUMMARY = "Crossbar.IO"
DESCRIPTION = "Crossbar.IO"
AUTHOR = "Viktor Sjölind <viktor.sjolind@pelagicore.com>"
HOMEPAGE = "https://crossbar.io/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI[md5sum] = "fc7cceeb1d107653dea73d9cb7d8d38d"
SRC_URI[sha256sum] = "1a5693581f4b349588587881580bd47d38df75398d15bc08f72b75501d2f92dd"

CLEANBROKEN = "1"

PYPI_PACKAGE = "crossbar"

RDEPENDS_${PN} = "${PYTHON_PN}-werkzeug ${PYTHON_PN}-jinja2 ${PYTHON_PN}-itsdangerous ${PYTHON_PN}-click"
