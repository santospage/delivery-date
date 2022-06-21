package br.com.santospage.deliverydate.order.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.santospage.deliverydate.order.model.OrderModel;

public interface OrderRepository extends JpaRepository<OrderModel, String> {
	List<OrderModel> findAll();
}
