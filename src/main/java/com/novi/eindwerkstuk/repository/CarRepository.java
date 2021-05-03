package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
