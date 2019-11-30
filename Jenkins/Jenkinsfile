pipeline {
	agent any
	stages {
		stage('Checkout') {
			steps {
					git 'https://github.com/edureka-git/DevOpsClassCodes'
				}
		}
		
		stage('Build') {
			steps {
						dir('') {
						sh '/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/myMaven/bin/mvn -B -V -U -e clean package'
						}
					}
		}
		
		stage('Email') {
			steps {
						emailext attachLog: true, body: 'The status of the build can be obtained from the build log attached', subject: 'STATUS: $PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', to: 'iamdevopstrainer@gmail.com'
				}
		}
		
		stage('Deployment') {
			steps {
							// Deployment
							script {
									echo "deployment"
									//sh 'cp /var/lib/jenkins/workspace/PipelineCode/target/addressbook.war /opt/tomcat/webapps/'
							}
				}
		}
		
		stage('publish html report') {
			steps {
										echo "publishing the html report"
										publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: '', reportFiles: 'index.html', reportName: 'HTML Report', reportTitles: ''])
					}
		}
		
		stage('clean up') {
			steps {
							echo "cleaning up the workspace"
		//					cleanWs()
					}
		}
		
		}
		
}
