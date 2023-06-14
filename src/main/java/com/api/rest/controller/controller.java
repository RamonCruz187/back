
package com.api.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping ("/get")
    public String salaudar(){
        return "hola crack";
    }
}
