#!/usr/bin/env groovy

/**
 * Send notifications based on build status string
 */
def n = 1
def call(String buildStatus = 'STARTED') {
  println "This is comming from shared liberary"
  println this.args
  if (n == n) {
    println "Yeah!!, build has been started"
  } else {
    println "Ohh!! build not started"
  }
}
