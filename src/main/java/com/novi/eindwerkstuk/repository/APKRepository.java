package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.APK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface APKRepository extends JpaRepository<APK, Long> {
}
