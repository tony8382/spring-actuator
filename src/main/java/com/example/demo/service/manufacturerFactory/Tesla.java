package com.example.demo.service.manufacturerFactory;

import com.example.demo.service.manufacturerFactory.enums.CarType;
import org.springframework.stereotype.Service;

@Service
public class Tesla implements Manufacturer {
    @Override
    public CarType getBrand() {
        return CarType.TESLA;
    }

    @Override
    public String getHeadquarter() {
        return "USA";
    }

    @Override
    public int getFoundYear() {
        return 2003;
    }
}
