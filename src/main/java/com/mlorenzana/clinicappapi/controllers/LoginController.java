package com.mlorenzana.clinicappapi.controllers;

import com.mlorenzana.clinicappapi.security.AuthenticationBean;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;

@RestController
@RequestMapping("api/login")
public class LoginController {

    @GetMapping
    public Principal user(Principal user) {
        return user;
    }

    @GetMapping(path = "/basicauth")
    public AuthenticationBean authenticate() {
        return new AuthenticationBean("You are authenticated");
    }
}
