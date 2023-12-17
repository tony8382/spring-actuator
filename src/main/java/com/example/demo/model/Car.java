package com.example.demo.model;

import com.example.demo.service.beautyStrategy.Beauty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {
    private String color;
    private int year;
    private String brand;
    private Beauty beauty;
}
