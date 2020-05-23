pipeline {
    agent {
        docker { image 'maven:3-alpine' }
    }

    stages {
        stage('test') {
            steps {
                sh 'test stage works'
            }
        }
        stage('build') {
            steps {
                sh 'build stage works'
            }
        }
    }
}