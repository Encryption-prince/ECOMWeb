package com.subham.Ecomweb.ECOMWeb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hellow")
    public void greet(){
        System.out.println("Hellow World!!");
    }
}
