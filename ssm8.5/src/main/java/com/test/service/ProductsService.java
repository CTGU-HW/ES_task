package com.test.service;

import com.test.po.Products;
import com.test.po.ProductsExample;

import java.util.List;

public interface ProductsService {
    int deleteByPrimaryKey(Integer pid);

    int insert(Products record);

    int insertSelective(Products record);

    List<Products> selectByExample(ProductsExample example);

    Products selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Products record);

    int updateByPrimaryKey(Products record);

    List<Products> selectByCid(Integer cid);
}
