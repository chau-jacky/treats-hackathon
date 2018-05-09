#!/bin/bash
mvn clean package

docker build -t gcr.io/techfest-hackathon-4/treats-euc-ui:v3 .

gcloud docker -- push gcr.io/techfest-hackathon-4/treats-euc-ui:v3

kubectl run treats-euc-ui --image=gcr.io/techfest-hackathon-4/treats-euc-ui:v3 --port=8080

kubectl expose deployment treats-euc-ui --type=LoadBalancer

kubectl scale deployment treats-euc-ui --replicas=3


kubectl set image deployment/treats-euc-ui treats-euc-ui=gcr.io/techfest-hackathon-4/treats-euc-ui:v3
-------------------------

cd ./target/appengine-staging
gcloud beta app gen-config --custom

gcloud container builds submit --tag gcr.io/techfest-hackathon-4/treats-euc-ui:v1 .

gcloud container clusters create treats-euc-cluster --num-nodes 3 --machine-type n1-standard-1 --zone us-central1-c

