package com.javainuse;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
//		from("file:C://inputFolder?noop=true").to("file:C://outputFolder");	// input to output folder copy-paste
		from("stream:in?promptMessage=Enter something:").transform(simple("${body.toUpperCase()}")).to("stream:out"); // input to uppercase output
		
	}
}