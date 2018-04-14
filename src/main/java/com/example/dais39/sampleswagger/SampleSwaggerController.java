package com.example.dais39.sampleswagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleSwaggerController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello Swagger!";
    }

    @GetMapping("/hi")
    public String getHi() {
        return "Hi Swagger!";
    }

    @GetMapping("/bye")
    public String getBye() {
        return "Bye Swagger!";
    }
}
