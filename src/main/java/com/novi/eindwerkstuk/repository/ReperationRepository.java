package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.Reperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReperationRepository extends JpaRepository<Reperation, Long> {
    List<Reperation> findByStatusStartingWithOrderByStatus(String status);
}
