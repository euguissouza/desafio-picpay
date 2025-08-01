package com.desafio_pic_pay.api_picpay.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ApiControllerTest {
    private ArrayList<String> teste = new ArrayList<>();


    @GetMapping("/teste")
    public ResponseEntity<String> olaMundo(){
        return ResponseEntity.ok("Ola mundo");
    }

}
