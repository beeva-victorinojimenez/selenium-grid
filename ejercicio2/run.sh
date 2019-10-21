#!/bin/sh
set -e

export HOST_HUB=10.23.60.128
mvn compile
mvn exec:java -Dexec.mainClass="com.bbva.selenium.Main" -Dexec.cleanupDaemonThreads=false
