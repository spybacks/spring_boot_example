#!/usr/bin/env bash
gradle assemble
cd Compose
docker-compose --file docker-compose-dev.yml build
docker-compose --file docker-compose-dev.yml up
# -d to add to detach