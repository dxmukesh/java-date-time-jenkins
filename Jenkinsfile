pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'javac DateTimePrinter.java'
            }
        }

        stage('Run') {
            steps {
                bat 'java DateTimePrinter'
            }
        }
    }
}
