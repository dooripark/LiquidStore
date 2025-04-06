package com.liquidstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpSession;
import java.util.List;
import com.liquidstore.service.OrderService;
import com.liquidstore.model.Cart;
import com.liquidstore.model.Order;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/checkout")
    public String checkout(Order order, HttpSession session) {
        List<Cart> cartList = (List<Cart>) session.getAttribute("cart");

        double totalPrice = orderService.calculateTotalPrice(cartList);
        order.setTotalPrice(totalPrice);
        order.setItems(cartList);

        orderService.createOrder(order);

        session.removeAttribute("cart");

        return "redirect:/order/confirmation";
    }

    @GetMapping("/order/confirmation")
    public String confirmation() {
        return "order/confirmation";
    }
}
