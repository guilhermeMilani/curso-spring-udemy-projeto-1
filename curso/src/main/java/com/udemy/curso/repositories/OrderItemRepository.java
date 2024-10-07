package com.udemy.curso.repositories;

import com.udemy.curso.entities.OrderItem;
import com.udemy.curso.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
