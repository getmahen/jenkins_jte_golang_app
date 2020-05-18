//To reference a specific pipeline template file. This setting overrides the global default pipeline template settings defined in the 
//Governance tier source code repo (pipeline-configuration/pipeline_config.groovy)
pipeline_template = "go_Jenkinsfile"

libraries{
  golang
}

application_environments{
    dev{
        terraform_role = "jenkins_role"
    }
    prod{
        long_name = "Production"
        terraform_role = "jenkins_role"
    }
}
