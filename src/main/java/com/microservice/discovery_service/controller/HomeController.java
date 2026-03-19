package com.microservice.discovery_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class HomeController {

    @GetMapping
    public String home() {
        return "Welcome to E-commerce Platform! API is running successfully. Visit /api/products for product management.";
    }

    @GetMapping("/api")
    public String apiHome() {
        return "E-commerce Platform API v1.0 - Available endpoints: GET /api/products, POST /api/products, GET /api/products/{id}, PUT /api/products/{id}, DELETE /api/products/{id}";
    }
}