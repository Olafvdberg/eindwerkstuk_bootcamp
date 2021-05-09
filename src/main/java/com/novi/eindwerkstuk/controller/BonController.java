package com.novi.eindwerkstuk.controller;

import com.novi.eindwerkstuk.model.Bon;
import com.novi.eindwerkstuk.service.BonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class BonController {

    @Autowired
    BonService bonService;

    @GetMapping(value = "/bon/{id}")
    public ResponseEntity<Object> getBon(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(bonService.getBonById(id), HttpStatus.OK);
    }

    @PutMapping(value = "/bon/{id}")
    public ResponseEntity<Object> updateBon(@PathVariable("id") Integer id, @RequestBody Bon bon) {
        bonService.updateBon(id, bon);
        return new ResponseEntity<>("Record updated", HttpStatus.NO_CONTENT);
    }
}
