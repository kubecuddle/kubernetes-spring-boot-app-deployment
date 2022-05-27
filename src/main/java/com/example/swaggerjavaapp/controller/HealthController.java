package com.example.swaggerjavaapp.controller;

import com.example.swaggerjavaapp.model.Health;
import com.example.swaggerjavaapp.service.HealthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")

public class HealthController {
    @Autowired
    HealthService healthService;
    
    @GetMapping("/healthz")
    public ResponseEntity<Health> healthz() {
        return healthService.healthz();
    }
}
