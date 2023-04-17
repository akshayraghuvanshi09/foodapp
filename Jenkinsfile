pipeline{
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        
        stage("SCM Checkout"){
            steps{
            git url: 'https://github.com/akshayraghuvanshi09/foodapp.git',branch:'main' 
            }
        }
         stage("Sonar")
        {
            steps {
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '7d638e9e-3c9e-4029-8483-fa2dd72abf56', url: 'https://github.com/akshayraghuvanshi09/foodapp.git']])
           bat 'mvn sonar:sonar'
            }
        }
        stage("Maven Build"){
            steps{
checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: '7d638e9e-3c9e-4029-8483-fa2dd72abf56', url: 'https://github.com/akshayraghuvanshi09/foodapp.git']])
                bat 'mvn clean package'
            }
        }
        stage("Docker Image"){
            steps{
                bat 'docker build -f Dockerfile -t devops-integration .'
            }
        }
         stage("Docker Run"){
            steps{
                 
                bat 'cd C:/Users/Its/.jenkins/workspace/devops'
                bat 'docker run -p 8088:8088 --network spring-mysql -d devops-integration'
            }
        }
    }
}