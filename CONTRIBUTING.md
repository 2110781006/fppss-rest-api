# Contributing Guide

## Local Dev Environment

### Run via Docker

Build the container image.

    docker build -t fppss-rest-api .

Run the container on host port 8080.

    docker run --rm -p 8080:8080 fppss-rest-api

