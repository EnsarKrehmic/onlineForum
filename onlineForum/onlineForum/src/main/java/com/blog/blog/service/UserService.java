package com.blog.blog.service;

import com.blog.blog.dto.RegistrationDto;
import com.blog.blog.entity.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    User findByEmail(String email);
}
