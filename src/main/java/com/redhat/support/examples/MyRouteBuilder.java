package com.redhat.support.examples;

import javax.jms.Queue;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component("routes")
public class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("myamqp:{{source-queue}}")
        .process(new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                Queue queue = (Queue) exchange.getIn().getHeader("JMSDestination");
                if(queue == null) {
                    throw new Exception("could not process header for message");
                }
            }
        })
        .log("sending message to: ${header.JMSDestination}")
        .toD("myamqp:${headers.JMSDestination}");
    }
}
