package com.example.demo;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tags;
import io.micrometer.core.instrument.binder.MeterBinder;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class RequestMetrics implements MeterBinder {


    private MeterRegistry meterRegistry;

    public Counter getCounter(String t, String t2) {
        return Counter.builder("test").tag(t, t2).register(meterRegistry);
    }

    @Override
    public void bindTo(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        meterRegistry.counter("test");
        meterRegistry.gauge("gn.temperature.gauge", Tags.of("site", "SiteA", "cab", "cab01"), new AtomicInteger(37));
    }
}
