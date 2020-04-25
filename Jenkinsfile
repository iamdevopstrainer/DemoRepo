pipeline
{
	agent any
	stages
	{
		stage('Checkout')
		{
			steps
			{
				git 'https://github.com/iamdevopstrainer/DevOpsClassCodes'
			}
		}
		
		stage('Build')
		{
			steps
			{
				dir('')
				{
					sh '/var/lib/jenkins/tools/hudson.tasks.Maven_MavenInstallation/myMaven/bin/mvn package'
				}
			}
		}
		
		stage('Deployment')
		{
			steps
			{
				script
				{
					echo "Deployment"
					sh 'sudo cp /var/lib/jenkins/workspace/DemoJob1/target/addressbook.war /usr/share/tomcat/webapps/'
				}
			}
		}
	}
		
}
