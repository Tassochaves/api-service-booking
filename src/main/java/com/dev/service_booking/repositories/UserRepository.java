package com.dev.service_booking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.service_booking.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    User findFirstByEmail(String email);

}
