package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action, Long> {
}
