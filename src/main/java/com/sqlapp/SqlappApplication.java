package com.sqlapp;

import com.sqlapp.frame.NewJFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlappApplication {

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(SqlappApplication.class, args);
		NewJFrame.main();
	}

}
