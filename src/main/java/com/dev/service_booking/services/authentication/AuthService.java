package com.dev.service_booking.services.authentication;

import com.dev.service_booking.dtos.SignupRequestDTO;
import com.dev.service_booking.dtos.UserDTO;

public interface AuthService {

    UserDTO signupClient(SignupRequestDTO signupRequestDTO);
    
    UserDTO signupCompany(SignupRequestDTO signupRequestDTO);

    Boolean presentByEmail(String email);

}
