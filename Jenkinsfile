pipeline {
    agent any
    tools {
        maven 'Maven 3.5.0'
        jdk 'jdk8'
    }

    stages {
        stage('Compile Stage') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true clean install'
            }
        }
    }
}