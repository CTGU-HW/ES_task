package com.test.controller;

import com.test.po.Category;
import com.test.po.Products;
import com.test.po.ProductsExample;
import com.test.po.User;
import com.test.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsService productsService;

    @RequestMapping(value = "selectAll",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Products> selectData(){

        List<Products> productsList = productsService.selectByExample(new ProductsExample());
        System.out.println("获取所有Products信息");
        return productsList;
    }

    @RequestMapping(value = "findById/{id}",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Products findById(@PathVariable("id")Integer id){
        System.out.println("获取id为"+id+"的商品信息");
        return productsService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "findByCid/{id}",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Products> findByCid(@PathVariable("id")Integer id){
        System.out.println("获取分类类别cid为"+id+"的所有商品");
        return productsService.selectByCid(id);
    }

    @RequestMapping(value = "save",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public String save(@RequestBody Products products){
        System.out.println("存入一个商品信息");
        int insertProduct = 0;
        try {
            insertProduct= productsService.insert(products);
        } catch (Exception e) {
            e.printStackTrace();
            log.println("捕获插入异常,同时写入日志文件");
        }
        if(insertProduct != 0){
            System.out.println(insertProduct);
            return "success";
        }else{
            System.out.println(insertProduct);
            return "error";
        }
    }

    @RequestMapping(value = "update",method = RequestMethod.PUT,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public String update(@RequestBody Products products){
        int result = 0;
        result = productsService.updateByPrimaryKey(products);
        System.out.println("修改Pid为"+products.getPid()+"用户的信息");
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
        result = productsService.deleteByPrimaryKey(id);
        System.out.println("删除pid为"+id+"商品的信息");
        if(result != 0){
            System.out.println(result);
            return "success";
        }else{
            System.out.println(result);
            return "error";
        }
    }
}
