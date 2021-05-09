package com.novi.eindwerkstuk.service;

import com.novi.eindwerkstuk.exception.RecordNotFoundException;
import com.novi.eindwerkstuk.model.Action;
import com.novi.eindwerkstuk.model.Stock;
import com.novi.eindwerkstuk.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService{
    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> getAllStocks(){
        return stockRepository.findAll();
    }

    @Override
    public Stock getStockById(long id) {
        if (stockRepository.existsById(id)) {
            return stockRepository.findById(id).get();
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public long addStock(Stock stock) {
        Stock newStock = stockRepository.save(stock);
        return newStock.getStock_id();
    }

    @Override
    public void deleteStock(long id) {
        if (stockRepository.existsById(id)) {
            stockRepository.deleteById(id);
        }
        else {
            throw new RecordNotFoundException();
        }
    }

    @Override
    public void updateStock(long id, Stock stock) {
        if (stockRepository.existsById(id)) {
            Stock existingStock = stockRepository.findById(id).get();
            existingStock.setPart_name_stock(stock.getPart_name_stock());
            existingStock.setAmount_in_stock(stock.getAmount_in_stock());
            existingStock.setPart_price_stock(stock.getPart_price_stock());
        }
        else {
            throw new RecordNotFoundException();
        }
    }
}
