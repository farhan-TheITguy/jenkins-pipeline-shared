#!/usr/bin/env groovy

/**
 * Send notifications based on build status string
 */
def call(String buildStatus = 'STARTED') {
  println "This is comming from shared liberary"
  println this.args
}

def slackSend() {
  println "SlackSend method is here"
}
