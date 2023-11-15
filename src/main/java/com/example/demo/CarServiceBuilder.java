package com.example.demo;

public class CarServiceBuilder {
    private CarDAO carDAO;
    private EmailService emailService;
    private MOTService motService;

    public CarServiceBuilder setCarDAO(CarDAO carDAO) {
        this.carDAO = carDAO;
        return this;
    }

    public CarServiceBuilder setEmailService(EmailService emailService) {
        this.emailService = emailService;
        return this;
    }

    public CarServiceBuilder setMotService(MOTService motService) {
        this.motService = motService;
        return this;
    }

    public CarService createCarService() {
        return new CarService(carDAO, emailService, motService);
    }
}