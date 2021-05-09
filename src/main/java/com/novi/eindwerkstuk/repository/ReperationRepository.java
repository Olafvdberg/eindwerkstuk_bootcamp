package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.Reperation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReperationRepository extends JpaRepository<Reperation, Long> {
    List<Reperation> findByStatusStartingWithOrderByStatus(String status);
}
