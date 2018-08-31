package com.example.bike;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @GetMapping("/user")
    public String addUser(){
    return "user";
   }

    @PostMapping("/user")
    public String show(@RequestParam String username,
                       @RequestParam String email,
                       ModelMap map){

       User user = new User(username, email);
       map.put ("user", user);

       return "show";
 }

}
