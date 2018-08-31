package com.example.bike;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class TermsController {

    @GetMapping("/terms")
    public String addTerms() {
        return "terms";
    }

    @PostMapping("/terms")
    public String period(@RequestParam String dateOfRental,
                         @RequestParam String dateOfReturn,
                         ModelMap map) {
        Terms terms = new Terms(dateOfRental, dateOfReturn);
        map.put("terms", terms);
        return "period";


    }
}
