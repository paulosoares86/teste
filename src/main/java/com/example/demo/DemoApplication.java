package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(DemoApplication.class, args);

		String beansFile = "beans.xml";
		GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext(beansFile);

		Encryptor x = (Encryptor) applicationContext.getBean("encryptor");

		x.printKey();

//		System.out.println(cdrw);
	}
}
