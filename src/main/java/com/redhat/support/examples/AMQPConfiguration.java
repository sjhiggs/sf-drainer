package com.redhat.support.examples;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration parameters filled in from application.properties and overridden using env variables on Openshift.
 */
@Configuration
@ConfigurationProperties(prefix = "amq-camel")
public class AMQPConfiguration {

    /**
     * AMQ Hostname
     */
    private String hostname;

    /**
     * AMQ port
     */
    private Integer port;

    /**
     * AMQ username
     */
    private String username;

    /**
     * AMQ password
     */
    private String password;

    /**
     * AMQ parameters
     */
    private String parameters;

    /**
     * AMQ protocol (amqp or amqps)
     */
    private String protocol;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public AMQPConfiguration() {
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


    @Override
    public String toString() {
        return "AMQPConfiguration{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", parameters='" + parameters + '\'' +
                ", protocol='" + protocol + '\'' +
                '}';
    }
}
