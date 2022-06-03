#!/bin/bash

# Assign the filename

filename="local.properties"
if [ -e "$filename" ]; then
  sed -i "s,.*VERSION_CODE.*,VERSION_CODE=\"$1\"," $filename
  sed -i "s/.*VERSION_NAME.*/VERSION_NAME=\"$2\"/" $filename
  sed -i "s/.*DESC.*/DESC=$3/" $filename
else
  touch local.properties
  echo "VERSION_CODE=$1" >> local.properties
  echo "VERSION_NAME=$2" >> local.properties
  echo "DESC=$3" >> local.properties
fi