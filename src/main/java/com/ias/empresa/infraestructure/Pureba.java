package com.ias.empresa.infraestructure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pureba {
    @RequestMapping(value = "/prueba", method = RequestMethod.GET)
    public String prueba() {
        return "prueba";
    }
}
