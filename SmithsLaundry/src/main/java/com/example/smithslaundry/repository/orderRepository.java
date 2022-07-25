package com.example.smithslaundry.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.smithslaundry.entity.Order;

public interface orderRepository extends CrudRepository<Order, Integer>{
}
