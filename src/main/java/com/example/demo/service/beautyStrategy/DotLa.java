package com.example.demo.service.beautyStrategy;

import com.example.demo.service.beautyStrategy.enums.BeautyType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DotLa implements Beauty {

    @Override
    public BeautyType getBeautyName() {
        return BeautyType.打蠟;
    }

    @Override
    public void execute() {
        log.info("Da da da");
    }
}
