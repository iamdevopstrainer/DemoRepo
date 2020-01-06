pipeline {
	agent any
	stages {
		stage('Checkout') {
			steps {
					git 'https://github.com/iamdevopstrainer/DevOpsClassCodes'
				}
		}
	
		stage('Build') {
			steps {
					dir('') {
					sh '/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/myMaven361/bin/mvn -B -V -U -e clean package'
				}
			}
		}
		
		stage('Deployment') {
			steps {
					script {
					echo "Deployment"
					sh 'sudo cp /var/lib/jenkins/workspace/PipelineJob/target/addressbook.war /usr/share/tomcat/webapps/'
				}
			}
		}

		stage('Email') {
			steps {
					emailext attachLog: true, body: 'The status of the build can be obtained from the build log attached', subject: 'STATUS: $PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', to: 'iamdevopstrainer@gmail.com'
				}
		}

	
	}
	
}
