package com.example.demo.service.manufacturerFactory;

import com.example.demo.service.manufacturerFactory.enums.CarType;
import org.springframework.stereotype.Service;

@Service
public class Bmw implements Manufacturer {
    @Override
    public CarType getBrand() {
        return CarType.BMW;
    }

    @Override
    public String getHeadquarter() {
        return "Germany";
    }

    @Override
    public int getFoundYear() {
        return 1916;
    }
}
