package com.example.demo.service.manufacturerFactory;

import com.example.demo.service.manufacturerFactory.enums.CarType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class SpringManufacturerFactory {

    private final Map<CarType, Manufacturer> manufacturers;

    public SpringManufacturerFactory(List<Manufacturer> manufacturers) {
        this.manufacturers = new HashMap<>();
        for (Manufacturer manufacturer : manufacturers) {
            this.manufacturers.put(manufacturer.getBrand(), manufacturer);
        }
    }

    public Manufacturer create(CarType car) throws Exception {
        try {
            return manufacturers.get(car);
        } catch (Exception e) {
            throw new Exception("not fount car type" + car);
        }
    }
}
