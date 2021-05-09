package com.novi.eindwerkstuk.repository;

import com.novi.eindwerkstuk.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, String> {
}