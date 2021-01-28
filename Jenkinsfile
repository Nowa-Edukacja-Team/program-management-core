pipeline {
  agent any

  tools {
      jdk 'java11-openjdk'
  }

  environment {
      PACKAGE = "neweducation/new-education-core"
      TAG = "v0.0.$BUILD_NUMBER"
      registryCredential = "dockerhub"
      dockerImage = ''
  }

  stages {
    stage('Maven package fast-jar') {
        steps {
            sh './mvnw package -Dquarkus.package.type=fast-jar'
        }
    }
    stage('Create Image') {
      steps {
        script {
            dockerImage = docker.build PACKAGE + ":" + TAG
        }
      }
    }
    stage('Publish image to DockerHub') {
      steps {
        script {
          docker.withRegistry('', registryCredential) {
              dockerImage.push()
          }
        }
      }
    }
    stage('Remove created Image') {
      steps {
        sh "docker rmi $PACKAGE:$TAG"
      }
    }
    stage('Deploy to cluster') {
      steps {
        withKubeConfig([credentialsId: 'kubeconfig']) {
          sh 'cat ./kubernetes/core.yml | sed "s#{{PACKAGE_VERSION}}#$TAG#g" | sed "s#{{PACKAGE_NAME}}#$PACKAGE#g" | kubectl apply -f -'
        }
      }
    }
  }
}