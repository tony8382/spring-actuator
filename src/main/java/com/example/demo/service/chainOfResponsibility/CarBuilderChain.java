package com.example.demo.service.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CarBuilderChain {

    private final List<CarBuilder> carBuilderChain;

    public CarBuilderChain(DoorBuilder doorBuilder, WindowBuilder windowBuilder, WheelBuilder wheelBuilder) {
        carBuilderChain = new ArrayList<>();
        carBuilderChain.add(doorBuilder);
        carBuilderChain.add(windowBuilder);
        carBuilderChain.add(wheelBuilder);
    }

    public void buildCar() {
        for (CarBuilder builder : carBuilderChain) {
            boolean result = builder.buildPart();
            if (!result) {
                break;
            }
        }
    }
}
