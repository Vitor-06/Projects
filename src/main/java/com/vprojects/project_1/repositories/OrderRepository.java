package com.vprojects.project_1.repositories;

import com.vprojects.project_1.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
