# SF Queue Drainer

Warning!  Test in your environment, use at your own risk.

## Description 

Simple util to move messages from AMQ Artemis Store-and-Forward queues back to original queues.  Examines the message header to determine which queue the message originally came from.  Only useful for instances where SF queue messages are "stuck", the cluster broker is no longer coming back.  

## Usage

1.  Configure the broker properties and source store-and-forward queue in src/main/resources/application.properties
2.  Run against the broker: `mvn clean spring-boot:run`

