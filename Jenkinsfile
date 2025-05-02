pipeline {
    agent any

    stages {
        stage('Build') {
            agent {
                docker {
                    image 'maven:3.9.9-eclipse-temurin-17'
                    reuseNode true
                }
            }
            steps {
                sh '''
                    ls -la
                    java -version
                    javac -version
                    mvn -version
                '''
            }
        }
        stage('Test') {
            agent {
                docker {
                    image 'maven:3.9.9-eclipse-temurin-17'
                    reuseNode true
                }
            }
            steps {
                sh '''
                    mvn clean verify --no-transfer-progress -X
                '''
            }            
        }
    }

    post {
        always {
            junit 'test-results/junit.xml'
        }
    }
}
