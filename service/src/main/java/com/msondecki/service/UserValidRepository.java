package com.msondecki.service;

import com.msondecki.dto.invalid.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserValidRepository extends JpaRepository<User, Long> {

    UserDTO findUserById(Long id);
}
