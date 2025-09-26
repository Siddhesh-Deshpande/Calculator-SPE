pipeline{
    triggers{
        githubPush()
    }
    agent any
    tools{
        maven '3.8.7'
    }
    stages{
        stage('Checkout'){
            steps{
                git branch:'main',url:'https://github.com/Siddhesh-Deshpande/Calculator-SPE.git'
            }
        }
        stage('Build and Test'){
            steps{
                sh 'mvn clean install '
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    def dockerImage = docker.build("siddhesh1712/calculator:latest", ".")
                    env.DOCKER_IMAGE_ID = dockerImage.id
                }
            }
        }
        stage('Push Docker Image to Hub') {
            steps {
                script {
                    docker.withRegistry('', 'DockerHubCred') {
                        docker.image(env.DOCKER_IMAGE_ID).push('latest')
                    }
                }
            }
        }
        stage('Clean Docker Images') {
            steps {
                sh 'docker container prune -f'
                sh 'docker image prune -f'
            }
        }
    }
}