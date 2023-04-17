pipeline {
    agent any
    stages {
        stage('clone') {
            steps {
                sh "rm -rf *"
                sh "git clone https://github.com/nawress-hamdi/jenkins-helloworld-1"
            }
        }
        stage('build') {
            steps {
                sh "cd jenkins-helloworld-1/ && javac Main.java"
          }
    }
        stage('run') {
            steps {
                sh "cd jenkins-helloworld/ && java Main"
        }
    }
    }
}
