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
                sh 'mvn --version'
            }
        }
        stage('build') {
            steps {
                sh 'cd WoPeD-CommonLibs/src/main/resources'
                sh 'mvn install:install-file -Dfile=jgraph-5.10.2 -DgroupId=org -DartifactId=jgraph -Dversion=5.10.2 -Dpackaging=jar -DgeneratePom=true'
                sh 'mvn install:install-file -Dfile=jgraphx-1.5.1.jar -DgroupId=org -DartifactId=jgraphx -Dversion=1.5.1 -Dpackaging=jar -DgeneratePom=true'
                sh 'mvn install'
            }
        }
    }
}