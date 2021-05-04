package com.brito.eliseu.springbootjwt.controller;

import com.brito.eliseu.springbootjwt.data.UserData;
import com.brito.eliseu.springbootjwt.service.UserDetailsServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserDetailsServiceImpl userDetailsService;

    public UserController(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @RequestMapping("/all-users")
    public List<UserData> listAllUsers() {
        return userDetailsService.listUsers();
    }

}
