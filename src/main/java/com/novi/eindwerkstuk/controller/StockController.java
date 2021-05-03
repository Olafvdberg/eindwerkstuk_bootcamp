package com.novi.eindwerkstuk.controller;

import com.novi.eindwerkstuk.model.Stock;
import com.novi.eindwerkstuk.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1")
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping(value = "/stock/{id}")
    public ResponseEntity<Object> getStock(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(stockService.getStockById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/stock")
    public ResponseEntity<Object> addStock(@RequestBody Stock stock) {

        long newId = stockService.addStock(stock);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newId)
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/stock/{id}")
    public ResponseEntity<Object> deleteStock(@PathVariable("id") Integer id) {
        stockService.deleteStock(id);
        return new ResponseEntity<>("Record deleted", HttpStatus.NO_CONTENT);
    }

    @PutMapping(value = "/stock/{id}")
    public ResponseEntity<Object> updateStock(@PathVariable("id") Integer id, @RequestBody Stock stock) {
        stockService.updateStock(id, stock);
        return new ResponseEntity<>("Record updated", HttpStatus.NO_CONTENT);
    }
}
