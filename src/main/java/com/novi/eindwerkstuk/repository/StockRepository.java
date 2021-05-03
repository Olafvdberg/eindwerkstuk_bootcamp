package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
