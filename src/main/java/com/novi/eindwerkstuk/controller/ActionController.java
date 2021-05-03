package com.novi.eindwerkstuk.controller;

import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class ActionController {

    @Autowired
    ActionService actionService;

    @GetMapping(value = "/action/{id}")
    public ResponseEntity<Object> getAction(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(actionService.getActionById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/action")
    public ResponseEntity<Object> addAction(@RequestBody Action action) {

        long newId = actionService.addAction(action);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newId)
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/action/{id}")
    public ResponseEntity<Object> deleteAction(@PathVariable("id") Integer id) {
        actionService.deleteAction(id);
        return new ResponseEntity<>("Record deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/action/{id}")
    public ResponseEntity<Object> updateCustomer(@PathVariable("id") Integer id, @RequestBody Action action) {
        actionService.updateAction(id, action);
        return new ResponseEntity<>("Record updated", HttpStatus.NO_CONTENT);
    }
}
