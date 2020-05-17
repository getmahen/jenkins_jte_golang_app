//To reference a specific pipeline template file. This setting overrides the global default pipeline template settings defined in the 
//Governance tier source code repo (pipeline-configuration/pipeline_config.groovy)
pipeline_template = "go_Jenkinsfile"

libraries{
  golang{
    number = 3
    message = "my message to be printed!"
  }
  sonarqube
  terraform
  slack
}

application_environments{
    dev{
        //ip_addresses = [ "0.0.0.1", "0.0.0.2" ]
        terraform_role = "jenkins_role"
    }
    prod{
        long_name = "Production"
        //ip_addresses = [ "0.0.1.1", "0.0.1.2", "0.0.1.3", "0.0.1.4" ]
        terraform_role = "jenkins_role"
    }
}
