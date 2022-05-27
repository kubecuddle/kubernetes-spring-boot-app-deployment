package com.example.swaggerjavaapp.service;

import com.example.swaggerjavaapp.model.Health;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpHeaders;



@Service
public class HealthService {

    public ResponseEntity<Health> healthz(){
        Health health = new Health("server is running", HttpStatus.OK);
        
        final HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<Health>(health, httpHeaders, HttpStatus.OK);
    }
    
}
