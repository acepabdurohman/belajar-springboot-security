package com.acepabdurohman.belajar.belajarspringbootsecurity.controller;

import com.acepabdurohman.belajar.belajarspringbootsecurity.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class UserController {
    @GetMapping("/user")
    @ResponseBody
    public String getUsers(){
        String url = "https://jsonplaceholder.typicode.com/users/5";
        RestTemplate restTemplate = new RestTemplate();
        User user = restTemplate.getForObject(url, User.class);
        System.out.println("ID : " + user.getId());
        return "";
    }
}
