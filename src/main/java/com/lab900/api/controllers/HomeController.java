package com.lab900.api.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HomeController {

    @Value("${app.url}")
    private String appUrl;

    @GetMapping("/")
    public String index(HttpServletResponse reponse) throws IOException {
        return "Check the api documentation at "+appUrl+"/swagger-ui.html";
    }
    @GetMapping("/_ah/start")
    public String startupCall(HttpServletResponse reponse) throws IOException {
        return "I have started!";
    }
}
