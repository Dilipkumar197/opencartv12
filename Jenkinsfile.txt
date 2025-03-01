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
                    // Run Maven to clean and install the project
                    sh 'mvn clean install'  // For Linux/Mac
                    // bat 'mvn clean install'  // For Windows (use this if running on Windows agents)
                }
            }
        }
        stage('Test') {
            steps {
                // Run Maven tests
                script {
                    // Run the tests
                    sh 'mvn test'  // For Linux/Mac
                    // bat 'mvn test'  // For Windows
                }
            }
        }
        stage('Publish Test Results') {
            steps {
                // Publish test results to Jenkins
                // Update the path to match where your test result XML files are located
                //junit '**/target/test-classes/testng-results.xml'  // Adjust path to the correct test result XML files

                // You can also publish the results from the specific test case directory like so:
                 junit '**/src/test/java/testCases/**/*.xml'  // Adjust as needed if your test results are located in a custom path
              
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
