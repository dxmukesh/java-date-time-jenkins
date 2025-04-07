pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo 'Cloning the repository...'
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling the code...'
                bat 'javac HelloWorld.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running the application...'
                bat 'java HelloWorld'
            }
        }
    }
}
