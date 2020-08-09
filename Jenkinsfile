pipeline {
    agent any
   
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "mvn -v"
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn install' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}