#!/usr/bin/env bash

# set -ex

error() {
  echo -e "\033[0;31m$@\033[m" 1>&2
}

fail() {
  error "$@"
  exit 1
}

if ! [ -x "$(command -v npm)" ]; then
  fail 'Error: npm is not installed'
fi

if ! [ -x "$(command -v markdownlint)" ]; then
  echo 'Installing markdownlint-cli'
  npm install -g markdownlint-cli
fi

markdownlint docs

if [ $? -ne 0 ]; then
  fail 'Fail: lint documents'
fi
