package com.liquidstore.controller;

import com.liquidstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.http.HttpSession;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("/cart/add")
    public String addToCart(@RequestParam int productId, HttpSession session) {
        cartService.addToCart(session, productId);
        return "redirect:/cart/view";
    }

    @GetMapping("/cart/view")
    public String viewCart(HttpSession session, Model model) {
        model.addAttribute("cart", cartService.getCart(session));
        return "cart/view";
    }

    @PostMapping("/cart/remove")
    public String removeFromCart(@RequestParam int productId, HttpSession session) {
        cartService.removeFromCart(session, productId);
        return "redirect:/cart/view";
    }
}
