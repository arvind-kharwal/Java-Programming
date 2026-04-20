package com.abes.cse18;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {
    @RequestMapping("/")
    String display() {
        return "<h1> Hello World</h1>";
    }
}
