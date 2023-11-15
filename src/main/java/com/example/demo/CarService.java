package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


public class CarService {
    private  CarDAO carDAO;
    private EmailService emailService;
    private MOTService motService;

    public  CarService(CarDAO carDAO,EmailService emailService,MOTService motService){
        this.carDAO = carDAO;
        this.emailService = emailService;
        this.motService = motService;

    }
}
