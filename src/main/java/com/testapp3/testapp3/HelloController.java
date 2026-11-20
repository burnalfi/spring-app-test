package com.testapp3.testapp3;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController 
public class HelloController {
    @GetMapping("/hello")
    public String getMethodName() {
        return "Hello world";
    }
    
    @RequestMapping("/")
	String home() {
		return "Hello world!";
	}
}
