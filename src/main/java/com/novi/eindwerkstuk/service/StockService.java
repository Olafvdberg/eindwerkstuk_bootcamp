package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Customer;
import com.novi.eindwerkstuk.model.Stock;

import java.util.List;

public interface StockService {
    List<Stock> getAllStocks();
    Stock getStockById(long id);
    long addStock(Stock stock);
    void deleteStock(long id);
    void updateStock(long id, Stock stock);
}
