#!/usr/bin/env groovy

/**
 * Send notifications based on build status string
 */
def call(String buildStatus = 'STARTED') {
  int n = 1
  println "This is comming from shared liberary"
  println this.args
  if (n == 1) {
    println "Yeah!!, build has been started"
  } else {
    println "Ohh!! build not started"
  }
}
