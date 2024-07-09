#!/bin/bash

cd ./portal
# Build the Spring Boot application
mvn clean package

# Navigate to the directory containing the Docker Compose file
cd ./services/user/grafanaandalertmanager


# Start Docker Compose services
sudo docker compose up

