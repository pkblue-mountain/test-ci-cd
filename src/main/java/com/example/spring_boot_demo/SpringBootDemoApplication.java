package com.example.spring_boot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}


/*
	scp -i test-instance-key-pair.pem C:\Users\sirim\Practice\AWS\spring-boot-demo\target\spring-boot-demo.jar ec2-user@ec2-18-222-55-168.us-east-2.compute.amazonaws.com:/home/ec2-user/app/
*/

// scp -i test.pem C:\Users\sirim\Practice\AWS\spring-boot-demo\target\spring-boot-demo.jar ec2-user@ec2-18-220-44-15.us-east-2.compute.amazonaws.com:/home/ec2-user/app/