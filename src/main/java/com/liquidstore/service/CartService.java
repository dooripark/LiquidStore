package com.liquidstore.service;

import org.springframework.stereotype.Service;
import com.liquidstore.model.Cart;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.ArrayList;

@Service
public class CartService {

    public void addToCart(HttpSession session, int productId) {
        List<Cart> cartList = (List<Cart>) session.getAttribute("cart");
        if (cartList == null) {
            cartList = new ArrayList<>();
        }

        boolean productExists = false;
        for (Cart cart : cartList) {
            if (cart.getProductId() == productId) {
                cart.setQuantity(cart.getQuantity() + 1);
                productExists = true;
                break;
            }
        }

        if (!productExists) {
            cartList.add(new Cart(productId, 1));
        }

        session.setAttribute("cart", cartList);
    }

    public List<Cart> getCart(HttpSession session) {
        return (List<Cart>) session.getAttribute("cart");
    }

    public void removeFromCart(HttpSession session, int productId) {
        List<Cart> cartList = (List<Cart>) session.getAttribute("cart");
        if (cartList != null) {
            cartList.removeIf(cart -> cart.getProductId() == productId);
            session.setAttribute("cart", cartList);
        }
    }
}
