package com.novi.eindwerkstuk.controller;

import com.novi.eindwerkstuk.model.Part;
import com.novi.eindwerkstuk.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class PartController {

    @Autowired
    PartService partService;

    @GetMapping(value = "/part")
    public ResponseEntity<Object> getPart() {
        return ResponseEntity.ok().body(partService.getAllParts());
    }

    @GetMapping(value = "/part/{id}")
    public ResponseEntity<Object> getPart(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(partService.getPartById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/part")
    public ResponseEntity<Object> addPart(@RequestBody Part part) {

        long newId = partService.addPart(part);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newId)
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/part/{id}")
    public ResponseEntity<Object> deletePart(@PathVariable("id") Integer id) {
        partService.deletePart(id);
        return new ResponseEntity<>("Record deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/part/{id}")
    public ResponseEntity<Object> updatePart(@PathVariable("id") Integer id, @RequestBody Part part) {
        partService.updatePart(id, part);
        return new ResponseEntity<>("Record updated", HttpStatus.NO_CONTENT);
    }
}
