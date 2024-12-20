package com.msondecki.dto.invalid;

/**
 * @author Mariusz Sondecki
 */
public class UserDTO {

    public UserDTO(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
