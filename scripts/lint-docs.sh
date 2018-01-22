#!/usr/bin/env bash

# set -ex

error() {
  echo -e "\033[0;31m$@\033[m" 1>&2
}

fail() {
  error "$@"
  exit 1
}

if ! [ -x "$(command -v markdownlint)" ]; then
  if [ -x "$(command -v yarn)" ]; then
    echo 'Installing markdownlint-cli with yarn'
    yarn global add markdownlint-cli
  elif [ -x "$(command -v npm)" ]; then
    echo 'Installing markdownlint-cli with npm'
    npm install -g markdownlint-cli
  else
    fail 'Error: both yarn and npm are not installed'
  fi
fi

markdownlint docs

if [ $? -ne 0 ]; then
  fail 'Fail: lint documents'
fi
