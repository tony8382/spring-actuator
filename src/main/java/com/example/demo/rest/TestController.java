package com.example.demo.rest;

import com.example.demo.RequestMetrics;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final RequestMetrics metrics;

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
