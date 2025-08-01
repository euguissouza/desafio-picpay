package com.desafio_pic_pay.api_picpay.controller;

import com.desafio_pic_pay.api_picpay.DTO.RequestTransfer;
import com.desafio_pic_pay.api_picpay.services.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/trasnfer")
public class ApiController {

    @Autowired
    private TransferService transferService;


    @PostMapping
    public  ResponseEntity<String> transfer(@RequestBody RequestTransfer request){
        try{
            transferService.transfer(request);
            return ResponseEntity.ok("Tranferencia realizada com sucesso!");
        } catch (RuntimeException e){
            return ResponseEntity.badRequest().body("Error" + e.getMessage());
        }
    }
}
