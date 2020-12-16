package com.test.service;

import com.test.po.Cart;
import com.test.po.CartExample;

import java.util.List;

public interface CartService {
    int deleteByPrimaryKey(Integer carid);

    int insert(Cart record);

    int insertSelective(Cart record);

    List<Cart> selectByExample(CartExample example);

    Cart selectByPrimaryKey(Integer carid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    List<Cart> selectByUid(Integer uid);

    int deleteByPid(Integer pid);

    int updateByPid_Uid(Cart record);
}
