package com.test.controller;

import com.test.dao.CategoryMapper;
import com.test.po.*;
import com.test.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "selectAll",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Category> selectData(){

        List<Category> categoryList = categoryService.selectByExample(new CategoryExample());

        return categoryList;
    }

    @RequestMapping(value = "findById/{id}",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Category findById(@PathVariable("id")Integer id){
        return categoryService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "save",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public String save(@RequestBody Category category){
        System.out.println("存入一个分类信息");
        int insert = 0;
        try {
            insert= categoryService.insert(category);
        } catch (Exception e) {
            e.printStackTrace();
            log.println("捕获插入异常,同时写入日志文件");
        }
        if(insert != 0){
            System.out.println(insert);
            return "success";
        }else{
            System.out.println(insert);
            return "error";
        }
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public String update(@RequestBody Category category){
        int result = 0;
        result = categoryService.updateByPrimaryKey(category);
        System.out.println("修改Cid为"+category.getCid()+"分类的信息");
        if(result != 0){
            System.out.println(result);
            return "success";
        }else{
            System.out.println(result);
            return "error";
        }
    }

    @RequestMapping(value = "deleteById/{id}",method = RequestMethod.DELETE,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public String delete(@PathVariable("id") Integer id){
        int result = 0;
        result = categoryService.deleteByPrimaryKey(id);
        System.out.println("删除id为"+id+"用户的信息");
        if(result != 0){
            System.out.println(result);
            return "success";
        }else{
            System.out.println(result);
            return "error";
        }
    }

}
