pipeline {
    agent {
        docker 'maven:3.6.3-jdk-11'
    }

    stages {
        stage('test') {
            sh 'test stage works'
        }
        stage('build') {
            sh 'build stage works'
        }
    }
}