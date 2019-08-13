#!/bin/bash
echo $GCLOUD_SERVICE_KEY | base64 --decode > ${HOME}/project/client-secret.json
gcloud config set project $FIREBASE_PROJECT_ID
gcloud auth activate-service-account $FIREBASE_SERVICE_ACCOUNT --key-file ${HOME}/project/client-secret.json
gcloud firebase test android run \
  --type instrumentation \
  --app ../app/build/outputs/apk/release/app-release.apk \
  --device-ids walleye \
  --os-version-ids 28 \
  --locales en \
  --orientations portrait \
  --async
