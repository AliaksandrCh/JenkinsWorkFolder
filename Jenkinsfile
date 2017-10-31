pipeline {
    agent any
    tools {
        maven 'Maven 3.5.2'
        jdk 'jdk8'
    }

    stages {
        stage('Compile Stage') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}