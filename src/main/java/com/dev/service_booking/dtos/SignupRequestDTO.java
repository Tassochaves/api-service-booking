package com.dev.service_booking.dtos;

import com.dev.service_booking.enums.UserRole;

import lombok.Data;

@Data
public class SignupRequestDTO {

    private Long id;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private String phone;
    private UserRole role;
}
