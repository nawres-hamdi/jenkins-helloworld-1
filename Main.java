pipeline {
    agent any 
    stages {
        stage('clone') { 
            steps {
                sh "rm -rf *"
                sh "git clone https://github.com/nawres-hamdi/jenkins-helloworld-1.git"
            }
        }
        stage('build') { 
            steps {
                sh "cd jenkins-helloworld-1/ && javac Main.java"
            }
        }
        stage('run') { 
            steps {
                sh "cd jenkins-helloworld-1/ && java Main"
            }
        }
    }
}
