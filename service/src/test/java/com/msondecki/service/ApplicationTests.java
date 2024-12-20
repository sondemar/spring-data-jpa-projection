package com.msondecki.service;

import com.msondecki.dto.invalid.UserDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
class ApplicationTests {

    @Autowired
    private UserValidRepository userValidRepository;

    @Test
    public void testProjection() {
        User user = new User();
        user.setName("John Doe");

        user = userValidRepository.save(user);

        Optional<User> foundUser = userValidRepository.findById(1L);

        Assertions.assertTrue(foundUser.isPresent());
        Assertions.assertEquals("John Doe", foundUser.get().getName());

        // Use DTO class from an external library
        UserDTO userDTO = userValidRepository.findUserById(1L);
        Assertions.assertEquals("John Doe", userDTO.getName());
    }
}
