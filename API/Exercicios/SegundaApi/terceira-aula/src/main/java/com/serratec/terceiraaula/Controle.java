package com.serratec.terceiraaula;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {
    
    @RequestMapping("/somar")
    public int somar(@RequestParam Integer num1, @RequestParam Integer num2) {
        return (num1+num2);
    }

    @RequestMapping("/subtrair")
    public int subtrair(@RequestParam Integer num1, @RequestParam Integer num2) {
        return (num1-num2);
    }

    @RequestMapping("/multiplicar")
    public double multiplicar(@RequestParam Double num1, @RequestParam Double num2) {
        return (num1*num2);
    }

    @RequestMapping("/dividir")
    public double dividir(@RequestParam Double num1, @RequestParam Double num2) {
        return (num1/num2);
    }
}