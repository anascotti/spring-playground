pipeline {
    agent any
    tools {
        jdk "JDK9"
        maven "mvn-3.5.2"
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
