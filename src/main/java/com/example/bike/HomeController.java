package com.example.bike;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/display")
    public String showResult(
            @RequestParam String type,
            @RequestParam String mark,
            ModelMap map) {
        System.out.println("Typ roweru "+type+" model" +mark);
        Product product = new Product (type, mark);
        map.put("result", product);

        return "display";
    }












}
