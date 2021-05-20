#!/usr/bin/env bash

set -e

[ -n "$1" ]

sed -En "s/.*$1 *= *(.*)/\\1/p" gradle.properties | head -n1