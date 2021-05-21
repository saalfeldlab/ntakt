#!/usr/bin/env bash

set -e

PROJECT_VERSION=$(.github/workflows/get-property.sh version)
echo PROJECT_VERSION="$PROJECT_VERSION" >> "$GITHUB_ENV"
echo PROJECT_VERSION="$PROJECT_VERSION"

if [[ "$PROJECT_VERSION" =~ ^[0-9]+\.[0-9]+\.[0-9]+$ ]]; then
    PATCH=$(echo "$PROJECT_VERSION" | tr '.' '\n' | tail -n1)
    MINOR=$(echo "$PROJECT_VERSION" | tr '.' '\n' | tail -n2 | head -n1)
    MAJOR=$(echo "$PROJECT_VERSION" | tr '.' '\n' | head -n1)
    NEW_PATCH=$((PATCH + 1))
    NEW_PROJECT_VERSION="$MAJOR.$MINOR.$NEW_PATCH-SNAPSHOT"
    IS_RELEASE_VERSION='1'
else
    NEW_PROJECT_VERSION=''
    IS_RELEASE_VERSION='0'
fi
echo NEW_PROJECT_VERSION="$NEW_PROJECT_VERSION" >> "$GITHUB_ENV"
echo NEW_PROJECT_VERSION="$NEW_PROJECT_VERSION"
echo IS_RELEASE_VERSION="$IS_RELEASE_VERSION" >> "$GITHUB_ENV"
echo IS_RELEASE_VERSION="$IS_RELEASE_VERSION"
