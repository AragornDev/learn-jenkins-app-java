pipeline {
    agent any

    stages {
        stage('Build') {
            agent {
                docker {
                    image 'maven:3.9.6-eclipse-temurin-17-alpine'
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
    }
}
