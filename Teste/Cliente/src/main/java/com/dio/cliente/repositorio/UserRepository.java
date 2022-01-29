package com.dio.cliente.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.cliente.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}