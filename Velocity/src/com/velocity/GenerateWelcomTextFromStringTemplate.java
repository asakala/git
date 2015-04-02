package com.velocity;

import java.io.StringWriter;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class GenerateWelcomTextFromStringTemplate {
	
	public static void main (String [] args){
		
		VelocityContext context = new VelocityContext();
		context.put("name", "Anil Kumar Sakala");
		
		Velocity.init();
		StringWriter output = new StringWriter();
		Velocity.evaluate(context, output, "Welcome Template", TemplateStore.geWelcomMessageTemplate());
		System.out.println(output);
		
	}

}
