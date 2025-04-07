package com.github.sipriano_dev.rest_java_springboot.controllers;

import com.github.sipriano_dev.rest_java_springboot.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//Abstração que usa @Controller(retorna html, javascript) e @ResponseBody(json, xml)
@RestController
public class GreetingController {

    private static final String template = "Hello %s";
    //Mock de ids, cria e incrementa automaticamente usando counter.incrementAndGet()
    private final AtomicLong counter = new AtomicLong();

    // http://localhost:8080/greeting?name=Anderson
    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World")
            String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
