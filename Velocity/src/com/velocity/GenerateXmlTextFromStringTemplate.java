package com.velocity;

import java.io.StringWriter;
import java.util.Date;

import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

public class GenerateXmlTextFromStringTemplate {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		employee1.setName("Anil");
		employee1.setDob(new Date());
		employee1.setAge(50);
		employee1.setSex('M');
		
		Employee employee2 = new Employee();
		employee2.setName("Neelima");
		employee2.setDob(new Date());
		employee2.setAge(26);
		employee2.setSex('F');
		
		VelocityContext context = new VelocityContext();
		context.put("employees", new Employee [] {employee1,employee2});
		
		Velocity.init();
		StringWriter output = new StringWriter();
		Velocity.evaluate(context, output, "Xml Template", TemplateStore.getEmployeeXmlTemplate());
		System.out.println(output);
		
	}

}
