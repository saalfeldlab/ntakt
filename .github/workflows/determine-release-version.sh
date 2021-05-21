#!/usr/bin/env bash

set -e

PROJECT_VERSION=$(.github/workflows/get-property.sh version)
echo PROJECT_VERSION="$PROJECT_VERSION"
# ensure that we are on an acutal SNAPSHOT
echo "$PROJECT_VERSION" | grep -- '-SNAPSHOT$' 1> /dev/null
echo PROJECT_VERSION="$PROJECT_VERSION" >> "$GITHUB_ENV"

# for now, just remove -SNAPSHOT, TBD: determine version from history
NEW_PROJECT_VERSION=$(echo $PROJECT_VERSION | sed 's/-SNAPSHOT$//')
echo NEW_PROJECT_VERSION="$NEW_PROJECT_VERSION" >> "$GITHUB_ENV"
echo NEW_PROJECT_VERSION="$NEW_PROJECT_VERSION"

