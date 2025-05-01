pipeline {
    agent any

    stages {
        stage('Build') {
            agent {
                docker {
                    image 'maven:3.9.9-eclipse-temurin-17'
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
    }
}
