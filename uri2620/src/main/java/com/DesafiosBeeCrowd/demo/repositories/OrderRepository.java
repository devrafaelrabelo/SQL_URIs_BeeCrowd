package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.OrderMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Order;
import com.DesafiosBeeCrowd.demo.projections.OrderMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    @Query(nativeQuery = true, value = "SELECT customers.name AS customerName, orders.id FROM orders " +
            "JOIN customers ON customers.id = orders.id_customers " +
            "WHERE extract(month from orders.orders_date) BETWEEN 1 AND 6")
    List<OrderMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.OrderMinDTO(obj.customer.name, obj.id) " +
            "FROM Order obj " +
            "WHERE extract(month from obj.ordersDate) BETWEEN 1 AND 6")
    List<OrderMinDTO> search2();
}
