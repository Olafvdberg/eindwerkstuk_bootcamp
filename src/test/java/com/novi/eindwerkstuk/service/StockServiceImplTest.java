package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.EindwerkstukApplication;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Stock;
import com.novi.eindwerkstuk.repository.ActionRepository;
import com.novi.eindwerkstuk.repository.StockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {EindwerkstukApplication.class})
class StockServiceImplTest {

    @Autowired
    private StockService stockService;

    @MockBean
    private StockRepository stockRepository;

    @Mock
    Stock stock;

    @BeforeEach
    public void setUp(){}

    @Test
    public void testGetActionById() {
        stock = new Stock("achterlamp", 30, 5);

        Mockito
                .when(stockRepository.findAllById(Collections.singleton(stock.getStock_id())))
                .thenReturn((List<Stock>) stock);

        int id = 1;
        int expected = 1;

        Stock found = stockService.getStockById(id);

        assertEquals(expected, found.getStock_id());
    }
}