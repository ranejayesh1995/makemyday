pipeline {
    agent any

    tools {
        maven 'maven3.9.9' // Ensure you have this Maven tool configured in Jenkins Global Tools
    }
    stages {
            stage('Code Compilation') {
                steps {
                    echo 'ode Compilation is In Progress!'
                    sh 'mvn clean compile'
                }
            }
            stage('JUnit TestCase Execution') {
                steps {
                    echo 'estCase execution is In Progress!'
                    sh 'mvn clean compile'
                }
            }
            stage('Code Package Execution') {
                steps {
                    echo 'Code Package Execution is In Progress!'
                    sh 'mvn package'
                }
            }
    }

    post{
        success{
            echo 'Build Completed Successfully'
        }
        failure{
            echo 'Build failed'
        }
    }
}