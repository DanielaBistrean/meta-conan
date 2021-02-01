inherit setuptools3 python3-dir
require python-distro.inc

RDEPENDS_${PN} = "\
    ${PYTHON_PN}-argparse \
    ${PYTHON_PN}-subprocess \
"