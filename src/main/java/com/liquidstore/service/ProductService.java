package com.liquidstore.service;

import com.liquidstore.dao.ProductDAO;
import com.liquidstore.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDAO productDAO;

    public List<ProductVO> getProductList() {
        return productDAO.getProductList();
    }

    public ProductVO getProductById(int id) {
        return productDAO.getProductById(id);
    }
}
