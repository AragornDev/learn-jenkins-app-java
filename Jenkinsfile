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
                    mvn clean verify --no-transfer-progress -X
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
                    test -f target/surefire-reports/com.example.restservice.greeting.GreetingControllerTests.txt
                    mvn clean test
                '''
            }            
        }
    }

    post {
        always {
            junit 'target/surfire-reports/TEST-com.example.restservice.greeting.GreetingControllerTests.xml'
        }
    }
}
