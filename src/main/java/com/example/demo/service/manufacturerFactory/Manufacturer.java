package com.example.demo.service.manufacturerFactory;

import com.example.demo.service.manufacturerFactory.enums.CarType;

public interface Manufacturer {
    CarType getBrand();

    String getHeadquarter();

    int getFoundYear();
}
