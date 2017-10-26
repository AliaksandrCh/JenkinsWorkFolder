pipeline {
    agent any
    tools {
        maven 'Maven 3.5.0'
        jdk 'jdk8'
    }

    stages {
        stage('Compile Stage') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }
    }
}