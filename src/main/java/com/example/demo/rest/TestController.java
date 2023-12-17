package com.example.demo.rest;

import com.example.demo.RequestMetrics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private RequestMetrics metrics;

    @GetMapping("hello")
    public boolean hello() {
        metrics.getCounter("dept", "it").increment();
        return true;
    }

    @GetMapping("h2")
    public boolean hello2() {
        metrics.getCounter("dept", "hr").increment();
        return true;
    }
}
