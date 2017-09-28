# Copyright (C) 2015 GENIVI Alliance
# Released under the MIT license (see COPYING.MIT for the terms)

FILESEXTRAPATHS_append := ":${THISDIR}/${PN}"

SRC_URI_append = "\
    file://EGLWLInputEventExample.desktop \
    file://EGLWLMockNavigation.desktop \
    "

FILES_${PN} += "\
    ${libdir}/applications/* \
    "

do_install_append() {
	install -d ${D}${libdir}/systemd/user
	install -m 0444 ${WORKDIR}/EGLWLInputEventExample.desktop \
	                ${D}/usr/share/applications/EGLWLInputEventExample.desktop

	install -m 0444 ${WORKDIR}/EGLWLMockNavigation.desktop \
	                ${D}/usr/share/applications/EGLWLMockNavigation.desktop
}
