package com.liquidstore.controller;

import com.liquidstore.service.ProductService;
import com.liquidstore.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/list")
    public String productList(Model model) {
        model.addAttribute("products", productService.getProductList());
        return "product/list";
    }

    @GetMapping("/product/detail")
    public String productDetail(int id, Model model) {
        model.addAttribute("product", productService.getProductById(id));
        return "product/detail";
    }
}
