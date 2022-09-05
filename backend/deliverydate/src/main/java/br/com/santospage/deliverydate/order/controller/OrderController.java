package br.com.santospage.deliverydate.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.santospage.deliverydate.order.model.OrderModel;
import br.com.santospage.deliverydate.order.repository.OrderRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/deliverydate")
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;

	@GetMapping("/order")	
	public List<OrderModel> listOrders(){
		return orderRepository.findAll();
	}

}
