pipeline {
    agent { docker 'maven:3.5.2' }
    tools {
	jdk "JDK9"
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
