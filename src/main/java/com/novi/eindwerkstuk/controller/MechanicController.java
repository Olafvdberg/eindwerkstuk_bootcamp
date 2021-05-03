package com.novi.eindwerkstuk.controller;

import com.novi.eindwerkstuk.model.Mechanic;
import com.novi.eindwerkstuk.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class MechanicController {

    @Autowired
    MechanicService mechanicService;

    @GetMapping(value = "/mechanic/{id}")
    public ResponseEntity<Object> getMechanic(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(mechanicService.getMechanicById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/mechanic")
    public ResponseEntity<Object> addMechanic(@RequestBody Mechanic mechanic) {

        long newId = mechanicService.addMechanic(mechanic);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newId)
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/mechanic/{id}")
    public ResponseEntity<Object> deleteMechanic(@PathVariable("id") Integer id) {
        mechanicService.deleteMechanic(id);
        return new ResponseEntity<>("Record deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/mechanic/{id}")
    public ResponseEntity<Object> updateMechanic(@PathVariable("id") Integer id, @RequestBody Mechanic mechanic) {
        mechanicService.updateMechanic(id, mechanic);
        return new ResponseEntity<>("Record updated", HttpStatus.NO_CONTENT);
    }
}
