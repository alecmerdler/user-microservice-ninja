#/usr/bin/bash

fuser -k 8080/tcp
fuser -k 8443/tcp
fuser -k 7443/tcp
