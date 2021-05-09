package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.Bon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BonRepository extends JpaRepository<Bon, Long> {
}
