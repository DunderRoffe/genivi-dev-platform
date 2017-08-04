NSMC="SimpleNodeStateMachine"
EXTRA_OECONF_append=" --with-nsmc=${NSMC} "
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = "file://0001-Build-SimpleNodeStateMachine.patch "

do_configure_prepend() {
    git clone https://github.com/GENIVI/simple-node-state-machine.git ${WORKDIR}/git/${NSMC}
    cd ${NSMC}
    git checkout b4de5dee4d70a223eef37bcbb5f8536560b0e243
    touch README NEWS AUTHORS ChangeLog
    cd -
}
