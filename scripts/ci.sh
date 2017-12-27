#!/usr/bin/env bash

# set -ex

scripts/lint-docs.sh

./gradlew check

echo -e "\033[0;32mFinished\033[m"
