package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.Bon;
import com.novi.eindwerkstuk.model.Car;
import com.novi.eindwerkstuk.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
