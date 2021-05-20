#!/usr/bin/env bash

set -e

# push to github from actions: https://stackoverflow.com/a/58393457/1725687
git config user.name github-actions
git config user.email github-actions@github.com
git add gradle.properties
git commit -m "Bump to next development cycle ($NEW_PROJECT_VERSION)"
git push