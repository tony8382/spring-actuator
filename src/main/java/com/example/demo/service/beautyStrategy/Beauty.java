package com.example.demo.service.beautyStrategy;

import com.example.demo.service.beautyStrategy.enums.BeautyType;

public interface Beauty {
    BeautyType getBeautyName();
    void execute();
}
