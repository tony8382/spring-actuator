package com.example.demo.service;

import com.example.demo.enums.CarType;
import com.example.demo.service.manufacturerFactory.Manufacturer;
import com.example.demo.service.manufacturerFactory.ManufacturerFactory;
import com.example.demo.service.manufacturerFactory.SpringManufacturerFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarService {

    private final SpringManufacturerFactory manufacturerFactory;

    public void manufacturerFactory() {
        Manufacturer manufacturer = null;
        try {
            manufacturer = manufacturerFactory.create(CarType.BMW);
        } catch (Exception e) {
            log.error("can not create factory", e);
        }
        log.info("brand: {}", manufacturer.getBrand());

    }
}
