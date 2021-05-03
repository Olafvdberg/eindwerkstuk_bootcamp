package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.model.Customer;
import com.novi.eindwerkstuk.model.Stock;

public interface StockService {
    Stock getStockById(long id);
    long addStock(Stock stock);
    void deleteStock(long id);
    void updateStock(long id, Stock stock);
}
