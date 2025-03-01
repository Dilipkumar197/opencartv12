pipeline {
    agent any  // Runs on any available agent

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the Git repository
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Run the Maven build command
                script {
                    // Use 'bat' for Windows to run Maven build
                    bat 'mvn clean install'  // For Windows (use this for Windows agents)
                }
            }
        }
        stage('Test') {
            steps {
                // Run Maven tests
                script {
                    // Use 'bat' for Windows to run Maven tests
                    bat 'mvn test'  // For Windows
                }
            }
        }
        stage('Publish Test Results') {
            steps {
                // Publish test results to Jenkins
                //junit '**/target/test-classes/testng-results.xml'  // Adjust path to the correct test result XML files
     
               //// Publish test results to Jenkins
                junit '**//OpencartV/src/test/java/testCases.xml'

            }
        }
    }

    post {
        always {
            // This will always run after the pipeline completes
            echo 'This is always executed after the build.'
        }
    }
}
