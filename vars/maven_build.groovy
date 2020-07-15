#!/usr/bin/env groovy
def call(dockerimage,mavenBuild) {

    docker.image("${dockerimage}").inside(){
        sh "${mavenBuild}"
    }
}
