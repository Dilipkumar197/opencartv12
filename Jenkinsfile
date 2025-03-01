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
                script {
                    // Run Maven build
                    bat 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run Maven tests
                    bat 'mvn test'
                }
            }
        }

        stage('Publish Test Results') {
            steps {
                // Publish the test results
                junit '**/target/surefire-reports/*.xml'  // Ensure the path matches the actual location of test result XML files
            }
        }
    }

    post {
        always {
            echo 'This is always executed after the build.'
        }
    }
}
