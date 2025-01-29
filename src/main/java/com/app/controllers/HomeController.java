package com.app.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entites.User;

@RestController
public class HomeController {
	
	@GetMapping("/health")
    public ResponseEntity<?> allUsers() {
        

        return ResponseEntity.status(HttpStatus.OK).body("Healthy");
    }
}
