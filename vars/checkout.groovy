#!/usr/bin/env groovy
@NonCPS

def call(branch, url) {

    
  def branchName = branch
   def urllink = url
    echo "aaa"
    
    echo "$branchName"
     echo  "hello world"
    echo "$urllink"
    checkout([
        $class: 'GitSCM',
      //  branches: [[name:  stageParams.branch_name ]],
      //  userRemoteConfigs: [[ url: stageParams.url_name ]]
        
        branches: [[name: "master" ]],
        userRemoteConfigs: [[ url: "https://github.com/Samlee97/java-maven-junit-helloworld.git" ]]
    ])
}
