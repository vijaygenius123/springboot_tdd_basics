package com.vijaygenius123.learning.tdd_basics.controllers;

import com.vijaygenius123.learning.tdd_basics.models.Car;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {


    @GetMapping("/{name}")
    public ResponseEntity<Car> getCarDetails(@PathVariable String name){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
