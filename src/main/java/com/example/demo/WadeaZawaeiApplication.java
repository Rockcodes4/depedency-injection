package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WadeaZawaeiApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(WadeaZawaeiApplication.class, args);
		// dependencies
		CarDAO carDAO = new CarDAO();
		EmailService emailService = new EmailService();
		MOTService motService = new MOTService(emailService);
		CarService carService = new CarService(carDAO,emailService,motService);

	}


}
