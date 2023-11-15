package com.example.demo;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class MOTService {
    private  EmailService emailService;

    public MOTService(EmailService emailService) {
        this.emailService = emailService;
    }
}
