# SF Queue Drainer

Warning!  Test in your environment, use at your own risk.  It is unknown what will happen if the original queue is a muticast address/queue, for example.

## Description 

Simple util to move messages from AMQ Artemis Store-and-Forward queues back to original queues.  Examines the message header to determine which queue the message originally came from.  Only useful for instances where SF queue messages are "stuck", the cluster broker is no longer coming back.  

## Usage

1.  Configure the broker properties and source store-and-forward queue in src/main/resources/application.properties
2.  Run against the broker: `mvn clean spring-boot:run`


## Original project

Came from:

```
VERSION=2.2.0.fuse-sb2-7_11_0-00022-redhat-00001
ARCHETYPE=spring-boot-camel-amq-archetype

mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate \
-DarchetypeCatalog=https://maven.repository.redhat.com/ga/io/fabric8/archetypes/archetypes-catalog/$VERSION/$VERSION-archetype-catalog.xml \
-DarchetypeGroupId=org.jboss.fuse.fis.archetypes \
-DarchetypeArtifactId=$ARCHETYPE \
-DarchetypeVersion=$VERSION
```
