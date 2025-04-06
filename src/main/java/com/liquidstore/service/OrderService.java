package com.liquidstore.service;

import org.springframework.stereotype.Service;
import com.liquidstore.model.Order;
import com.liquidstore.model.Cart;
import java.util.List;

@Service
public class OrderService {

    public double calculateTotalPrice(List<Cart> cartList) {

        double totalPrice = 0;
        for (Cart cart : cartList) {
            double price = 10.0;
            totalPrice += price * cart.getQuantity();
        }
        return totalPrice;
    }

    public void createOrder(Order order) {

        System.out.println("Order created: " + order);
    }
}
