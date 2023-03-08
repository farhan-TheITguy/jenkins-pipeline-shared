#!/usr/bin/env groovy

/**
 * Send notifications based on build status string
 */
def call(String buildStatus = 'STARTED') {
  println "This is comming from shared liberary"
  println this.args
  if (buildStatus == 'STARTED') {
    println "Yeah!!, build has been started"
  } else {
    println "Ohh!! build not started"
  }
}
