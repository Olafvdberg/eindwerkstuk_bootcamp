package com.novi.eindwerkstuk.controller;

import com.novi.eindwerkstuk.model.APK;
import com.novi.eindwerkstuk.service.APKService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class APKController {

    @Autowired
    APKService apkService;

    @GetMapping(value = "/APK")
    public ResponseEntity<Object> getAPK() {
        return ResponseEntity.ok().body(apkService.getAllAPK());
    }

    @GetMapping(value = "/APK/{id}")
    public ResponseEntity<Object> getAPK(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(apkService.getAPKById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/APK")
    public ResponseEntity<Object> addAPK(@RequestBody APK apk) {

        long newId = apkService.addAPK(apk);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newId)
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/APK/{id}")
    public ResponseEntity<Object> deleteAPK(@PathVariable("id") Integer id) {
        apkService.deleteAPK(id);
        return new ResponseEntity<>("Record deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/APK/{id}")
    public ResponseEntity<Object> updateAPK(@PathVariable("id") Integer id, @RequestBody APK apk) {
        apkService.updateAPK(id, apk);
        return new ResponseEntity<>("Record updated", HttpStatus.NO_CONTENT);
    }
}
