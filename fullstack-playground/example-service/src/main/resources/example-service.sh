#!/bin/bash

MAIN_CLASS = example-service.jar
BIN_DIR = /opt/example/bin/
APP_CONFIG = /opt/example/conf/application.conf
LOG_CONFIG = /opt/example/conf/log.conf

ARGS = "-Dconfig.file=${APP_CONFIG} -Dlogback.configurationFile=${LOG_CONFIG}"

exec java $ARGS -cp "BIN_DIR/*" $MAIN_CLASS