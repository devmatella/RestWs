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

    @RequestMapping("/restar")
    public Tupla restar(@RequestParam(value = "numero1", defaultValue = "0") int numero1,
                       @RequestParam(value = "numero2", defaultValue = "0") int numero2) {
        Tupla restar;

        restar = new Tupla(cant.incrementAndGet(), numero1-numero2);
        return restar;
    }

    @RequestMapping("/multiplicar")
    public Tupla multiplicar(@RequestParam(value = "numero1", defaultValue = "0") int numero1,
                             @RequestParam(value = "numero2", defaultValue = "0") int numero2) {
        Tupla multiplicar;

        multiplicar = new Tupla(cant.incrementAndGet(), numero1*numero2);
        return multiplicar;
    }

    @RequestMapping("/dividir")
    public Tupla dividir(@RequestParam(value = "numero1", defaultValue = "0") int numero1,
                             @RequestParam(value = "numero2", defaultValue = "0") int numero2) {
        Tupla dividir;

        dividir = new Tupla(cant.incrementAndGet(), numero1/numero2);
        return dividir;
    }


}