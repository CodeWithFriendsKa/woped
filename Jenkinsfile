pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-v $HOME/.m2:/root/.m2'
        }
    }

    stages {
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('build') {
            steps {
                sh 'mvn install'
            }
        }
    }
}