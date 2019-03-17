node {
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/EwelinaH/CRM_CarWorkshop.git'
   }
   stage('Build') {
      // Run the maven build
         sh "'mvn' -Dmaven.test.failure.ignore clean package"
      }
   stage('Results') {
    //   junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.war'
   }
   stage('Deploy') {
     sh "rm -rvf /usr/share/tomcat/webapps/ROOT.war"
     sh "cp target/CRM_CarWorkshop-1.0-SNAPSHOT-web.war /usr/share/tomcat/webapps/ROOT.war -v"
   }
}
