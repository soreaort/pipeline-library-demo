#!/usr/bin/env groovy
import hudson.model.*


// returns a list of changed files
@NonCPS
def call () {
/*    changedFiles = []
    for (changeLogSet in currentBuild.changeSets) { 
        for (entry in changeLogSet.getItems()) { // for each commit in the detected changes
            for (file in entry.getAffectedFiles()) {
                changedFiles.add(file.getPath()) // add changed file to list
            }
        }
    }
    return changedFiles
*/
println(currentBuild.changeSets) // should print an empty set

checkout(scm)

println(currentBuild.changeSets) // should print out any changes in the current build
}
