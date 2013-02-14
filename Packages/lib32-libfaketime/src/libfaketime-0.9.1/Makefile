INSTALL = install

all:
	$(MAKE) -C src all

install:
	$(MAKE) -C src install
	$(MAKE) -C man install
	$(INSTALL) -dm0755 "${DESTDIR}${PREFIX}/share/doc/faketime/"
	$(INSTALL) -m0644 README "${DESTDIR}${PREFIX}/share/doc/faketime/README"
	$(INSTALL) -m0644 NEWS "${DESTDIR}${PREFIX}/share/doc/faketime/NEWS"

uninstall:
	$(MAKE) -C src uninstall
	$(MAKE) -C man uninstall
	rm -f "${DESTDIR}${PREFIX}/share/doc/faketime/README"
	rm -f "${DESTDIR}${PREFIX}/share/doc/faketime/NEWS"
	rmdir "${DESTDIR}${PREFIX}/share/doc/faketime"

clean:
	$(MAKE) -C src clean

distclean:
	$(MAKE) -C src distclean

.PHONY: all install uninstall clean distclean
