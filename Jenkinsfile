pipeline {
    agent {
        docker {
            image 'maven:3.6.3-jdk-8'
            args '-v $HOME/.m2:/root/.m2'
            args '-u root'
        }
    }

    stages {
        stage('prepare') {
            steps {
                sh 'apt update'
                sh 'apt add zlib-dev'
            }
        }
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
        stage('exe erzeugen') {
            steps {
                sh 'cd WoPed-Installer'
                sh 'mvn package'
            }
        }
        stage('installer erzeugen (jar)') {
            steps {
                sh 'cd ../WoPeD-IzPack'
                sh 'mvn package'
            }
        }
        stage('exe fuer installer erzeugen') {
            steps {
                sh 'exe fuer installer erzeugen'
            }
        }
    }
}