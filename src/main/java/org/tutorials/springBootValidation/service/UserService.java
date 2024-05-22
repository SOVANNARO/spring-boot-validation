package org.tutorials.springBootValidation.service;

import org.tutorials.springBootValidation.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto getUserById(Long id);
    List<UserDto> getAllUsers();
    UserDto updateUser(UserDto user);
    void deleteUser(Long id);
}
