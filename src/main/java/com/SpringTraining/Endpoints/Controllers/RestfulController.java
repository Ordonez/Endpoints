package com.SpringTraining.Endpoints.Controllers;

import com.SpringTraining.Endpoints.Restful;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class RestfulController {

    private static final String template = "Welcome to %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/restful")
    public Restful restful(@RequestParam(value = "The Daily Restful Services Training", defaultValue = "World") String name) {
        return new Restful(counter.incrementAndGet(), String.format(template, "The Daily Restful Services Training"));
    }
}

