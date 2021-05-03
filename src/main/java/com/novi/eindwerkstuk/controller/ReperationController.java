package com.novi.eindwerkstuk.controller;

import com.novi.eindwerkstuk.model.Reperation;
import com.novi.eindwerkstuk.service.ReperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class ReperationController {

    @Autowired
    ReperationService reperationService;

    @GetMapping(value = "/reperation/{id}")
    public ResponseEntity<Object> getReperation(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(reperationService.getReperationById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/reperation")
    public ResponseEntity<Object> addReperation(@RequestBody Reperation reperation) {

        long newId = reperationService.addReperation(reperation);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newId)
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/reperation/{id}")
    public ResponseEntity<Object> deleteReperation(@PathVariable("id") Integer id) {
        reperationService.deleteReperation(id);
        return new ResponseEntity<>("Record deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/reperation/{id}")
    public ResponseEntity<Object> updateReperation(@PathVariable("id") Integer id, @RequestBody Reperation reperation) {
        reperationService.updateReperation(id, reperation);
        return new ResponseEntity<>("Record updated", HttpStatus.NO_CONTENT);
    }
}
