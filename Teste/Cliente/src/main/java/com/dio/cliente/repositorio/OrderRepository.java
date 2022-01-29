package com.dio.cliente.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.cliente.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}