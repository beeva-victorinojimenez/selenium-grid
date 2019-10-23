#!/bin/sh
set -e

export HOST_HUB=192.168.1.131
mvn clean test -Dbrowser=chrome
