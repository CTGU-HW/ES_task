package com.test.service.impl;

import com.test.dao.CategoryMapper;
import com.test.po.Category;
import com.test.po.CategoryExample;
import com.test.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return categoryMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Category record) {
        return categoryMapper.insert(record);
    }

    @Override
    public int insertSelective(Category record) {
        return categoryMapper.insertSelective(record);
    }

    @Override
    public List<Category> selectByExample(CategoryExample example) {
        return categoryMapper.selectByExample(new CategoryExample());
    }

    @Override
    public Category selectByPrimaryKey(Integer cid) {
        return categoryMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByPrimaryKeySelective(Category record) {
        return categoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Category record) {
        return categoryMapper.updateByPrimaryKey(record);
    }
}
