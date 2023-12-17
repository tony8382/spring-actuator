package com.example.demo.service.manufacturerFactory;

import com.example.demo.service.manufacturerFactory.enums.CarType;
import org.springframework.stereotype.Service;

@Service
public class Mazda implements Manufacturer {
    @Override
    public CarType getBrand() {
        return CarType.MAZDA;
    }

    @Override
    public String getHeadquarter() {
        return "Japan";
    }

    @Override
    public int getFoundYear() {
        return 1920;
    }
}
