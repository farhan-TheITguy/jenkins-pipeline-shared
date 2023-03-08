#!/usr/bin/env groovy

/**
 * Send notifications based on build status string
 */
def call(String buildStatus = 'STARTED') {
  int a = 2
  println "This is comming from shared liberary"
  println this.args
  if (a<100) { 
     //If the condition is true print the following statement 
     println("The value is less than 100"); 
  } else { 
     //If the condition is false print the following statement 
     println("The value is greater than 100"); 
  } 
}
