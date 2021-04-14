#!/usr/bin/env groovy

def call(Map pipelineParams = [:]) {
  pipeline {
    agent any
    stages {
      stage('Build') {
        steps {
          echo 'Building..'
        }
      }
      stage('Test') {
        steps {
          echo 'Testing..'
        }
      }
      stage('Deploy') {
        steps {
          echo "Deploying ${pipelineParams.fileName}"
        }
      }
    }
  }
}
