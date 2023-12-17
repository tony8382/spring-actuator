package com.example.demo.service;

import com.example.demo.SpringActuatorApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class CarServiceTest extends SpringActuatorApplicationTests {

    @Autowired
    private CarService carService;

    @Test
    void manufacturerFactory() {
        carService.manufacturerFactory();
    }

    @Test
    void carBeautyStrategy() {
        carService.carBeautyStrategy();
    }

    @Test
    void carBuilderChain() {
        carService.carBuilderChain();
    }
}