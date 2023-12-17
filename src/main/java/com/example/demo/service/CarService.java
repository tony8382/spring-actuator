package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.service.beautyStrategy.DoMore;
import com.example.demo.service.chainOfResponsibility.CarBuilderChain;
import com.example.demo.service.manufacturerFactory.Manufacturer;
import com.example.demo.service.manufacturerFactory.SpringManufacturerFactory;
import com.example.demo.service.manufacturerFactory.enums.CarType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarService {

    private final SpringManufacturerFactory manufacturerFactory;
    private final CarBuilderChain carBuilderChain;

    private final DoMore doMore;

    public void manufacturerFactory() {
        try {
            Manufacturer manufacturer = manufacturerFactory.create(CarType.BMW);
            log.info("brand: {}", manufacturer.getBrand());
        } catch (Exception e) {
            log.error("can not create factory", e);
        }
    }

    public void carBeautyStrategy() {
        Car car = Car.builder()
                .brand("MAZDA")
                .color("White")
                .year(2020)
                .build();

        car.setBeauty(doMore);
        car.getBeauty().execute();
    }

    public void carBuilderChain() {
        carBuilderChain.buildCar();
    }
}
