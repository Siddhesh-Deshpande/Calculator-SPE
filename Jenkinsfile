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
                    docker.withRegistry('https://index.docker.io/v1/', 'DockerHubCred') {
                        docker.image(env.DOCKER_IMAGE_ID).push('latest')
                    }
                }
            }
        }
        // stage('Clean Docker Images') {
        //     steps {
        //         sh 'docker container prune -f'
        //         sh 'docker image prune -f'
        //     }
        // }
        // stage('Ansible Deployment'){
        //     steps{
        //         sh 'ansible-playbook -i inventory.ini deploy.yml'
        //     }
        // }
        stage('Docker container creation'){
            steps{
                sh 'docker create -it --name calculator siddhesh1712/calculator:latest'
            }
        }
    }
}