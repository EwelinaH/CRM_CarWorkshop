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
}
