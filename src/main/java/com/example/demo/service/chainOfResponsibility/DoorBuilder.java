package com.example.demo.service.chainOfResponsibility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DoorBuilder implements CarBuilder {
    @Override
    public boolean buildPart() {
        log.info("Building a door");
        return true;
    }
}