#!/usr/bin/env bash

set -e

sed "s/^version=${PROJECT_VERSION}$/version=${NEW_PROJECT_VERSION}/" gradle.properties -i
PROJECT_VERSION=$(.github/workflows/get-property.sh version)
[ "$PROJECT_VERSION" = "${NEW_PROJECT_VERSION}" ]