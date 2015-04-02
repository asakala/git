package com.velocity;

public class TemplateStore {

	@TemplateVariables(values = { "$name - Name of person" })
	public static String geWelcomMessageTemplate() {
		String template = "Hello $name , Welcome to world of velocity";
		return template;
	}

	@TemplateVariables(values={"$employees - List of Employee objects"})
	public static String getEmployeeXmlTemplate() {
		StringBuilder template = new StringBuilder("#foreach($employee in $employees)");
		template.append("<employee>").append("\n");
		template.append("  <name>$employee.getName()</name>").append("\n");
		template.append("  <age>$employee.getAge()</age>").append("\n");
		template.append("  <sex>$employee.getSex()</sex>").append("\n");
		template.append("  <dob>$employee.getDob()</dob>").append("\n");
		template.append("</employee>").append("\n");
		template.append("#end").append("\n");
		return template.toString();
	}

}
