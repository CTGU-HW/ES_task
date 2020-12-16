package com.test.service.impl;

import com.test.dao.CartMapper;
import com.test.po.Cart;
import com.test.po.CartExample;
import com.test.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;

    @Override
    public int deleteByPrimaryKey(Integer carid) {
        return cartMapper.deleteByPrimaryKey(carid);
    }

    @Override
    public int insert(Cart record) {
        return cartMapper.insert(record);
    }

    @Override
    public int insertSelective(Cart record) {
        return cartMapper.insertSelective(record);
    }

    @Override
    public List<Cart> selectByExample(CartExample example) {
        return cartMapper.selectByExample(new CartExample());
    }

    @Override
    public Cart selectByPrimaryKey(Integer carid) {
        return cartMapper.selectByPrimaryKey(carid);
    }

    @Override
    public int updateByPrimaryKeySelective(Cart record) {
        return cartMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cart record) {
        return cartMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Cart> selectByUid(Integer uid) {
        return cartMapper.selectByUid(uid);
    }

    @Override
    public int deleteByPid(Integer pid) {
        return cartMapper.deleteByPid(pid);
    }

    @Override
    public int updateByPid_Uid(Cart record) {
        return cartMapper.updateByPid_Uid(record);
    }

}
