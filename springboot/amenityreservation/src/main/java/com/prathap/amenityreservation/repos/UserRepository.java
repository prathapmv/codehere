package com.prathap.amenityreservation.repos;

import com.prathap.amenityreservation.model.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);
}
