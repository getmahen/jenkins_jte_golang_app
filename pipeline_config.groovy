//To reference a specific pipeline template file. This setting overrides the global default pipeline template settings defined in the 
//Governance tier source code repo (pipeline-configuration/pipeline_config.groovy)
pipeline_template = "go_Jenkinsfile"

libraries{
  golang{
    buildEnvironment = env
  }
  ansible
}
