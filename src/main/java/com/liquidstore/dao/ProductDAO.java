package com.liquidstore.dao;

import com.liquidstore.vo.ProductVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAO {

    @Autowired
    private SqlSession sqlSession;

    public List<ProductVO> getProductList() {
        return sqlSession.selectList("com.liquidstore.dao.ProductDAO.getProductList");
    }

    public ProductVO getProductById(int id) {
        return sqlSession.selectOne("com.liquidstore.dao.ProductDAO.getProductById", id);
    }
}
