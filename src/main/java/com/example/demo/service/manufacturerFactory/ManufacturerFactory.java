package com.example.demo.service.manufacturerFactory;

import com.example.demo.service.manufacturerFactory.enums.CarType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ManufacturerFactory {

    private final Bmw bmw;
    private final Tesla tesla;
    private final Mazda mazda;

    public Manufacturer create(CarType car) throws Exception {
        switch (car) {
            case BMW:
                return bmw;
            case TESLA:
                return tesla;
            case MAZDA:
                return mazda;
            default:
                throw new Exception("not fount car type" + car);
        }
    }

}
