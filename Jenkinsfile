pipeline {
    agent any

    stages {
        stage('Build') {
            agent {
                docker {
                    image 'openjdk:17-alpine'
                }
            }
            steps {
                sh '''
                    java -version
                    ls -la
                '''
            }
        }
    }
}
