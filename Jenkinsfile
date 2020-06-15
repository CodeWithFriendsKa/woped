pipeline {
    agent {
        docker {
            image 'maven:3-alpine'
            args '-u root'
            // args '-v $HOME/.m2:/root/.m2'
        }
    }

    stages {
        stage('prepare') {
            steps {
                sh 'apk update'
                sh 'apk add zlib1g-dev libncurses5-dev lib32z1 lib32ncurses5'
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