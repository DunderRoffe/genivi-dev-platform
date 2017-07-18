NSMC="SimpleNodeStateMachine"
EXTRA_OECONF_append=" --with-nsmc=${NSMC} "
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = "file://0001-Build-SimpleNodeStateMachine.patch "

DEPENDS_append = " glibmm ivi-logging"

do_configure_prepend() {
    git clone https://github.com/GENIVI/simple-node-state-machine.git ${WORKDIR}/git/${NSMC}
    cd ${NSMC}
    git checkout e830b57223fc01532a303e05bccedbdcfde6df55
    touch README NEWS AUTHORS ChangeLog
    cd -
}
