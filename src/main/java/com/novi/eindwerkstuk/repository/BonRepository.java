package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.Bon;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BonRepository extends Repository {
    List<Bon> findCar(String type);


//    @Query(
//            value = "SELECT * FROM cars ")
//    public List<Bon> FindAllWithDescriptionQuery();
}
