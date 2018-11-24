package com.soa.ws.RestWs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SumarController {


    private final AtomicLong cant = new AtomicLong();

    @RequestMapping("/sumar")
    public Tupla sumar(@RequestParam(value = "numero1", defaultValue = "0") int numero1,
                       @RequestParam(value = "numero2", defaultValue = "0") int numero2) {
        Tupla suma;

        suma = new Tupla(cant.incrementAndGet(), numero1+numero2);
        return suma;
    }


}