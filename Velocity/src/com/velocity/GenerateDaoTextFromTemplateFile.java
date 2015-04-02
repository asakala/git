package com.velocity;

import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class GenerateDaoTextFromTemplateFile {

	public static void main(String[] args) {
		String tableName = "Employee";
		String tableNameWithDao = tableName + "Dao";
		String tableNameWithFirstLetterAsSmall = tableName.substring(0, 1).toLowerCase() + tableName.substring(1);

		VelocityContext context = new VelocityContext();
		context.put("TableName", tableName);
		context.put("TableNameDao", tableNameWithDao);
		context.put("TableNameRef", tableNameWithFirstLetterAsSmall);

		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.init();

		Template template = velocityEngine.getTemplate("./src/com/velocity/template/dao.vm");
		StringWriter writer = new StringWriter();
		template.merge(context, writer);

		System.out.println(writer.toString());

	}

}
