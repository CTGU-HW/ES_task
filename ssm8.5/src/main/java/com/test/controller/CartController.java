package com.test.controller;

import com.test.dao.CartMapper;
import com.test.po.*;
import com.test.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "selectAll",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Cart> selectData(){
        System.out.println("获取所有的购物车信息");
        List<Cart> cartList = cartService.selectByExample(new CartExample());
        return cartList;
    }

    @RequestMapping(value = "findById/{id}",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Cart findById(@PathVariable("id")Integer id){
        System.out.println("获取cartid为"+id+"的购物车信息");
        return cartService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "selectByUid/{id}",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Cart> selectByUid(@PathVariable("id")Integer id){
            System.out.println("获取uid为"+id+"的购物车信息");
            try {
                return cartService.selectByUid(id);
            } catch (Exception e) {
                e.printStackTrace();
                log.println("获取值异常，返回空");
                return null;
            }
    }

    @RequestMapping(value = "deleteByPid/{id}",method = RequestMethod.DELETE,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public String deleteByPid(@PathVariable("id") Integer id){
        int result = 0;
        result = cartService.deleteByPid(id);
        System.out.println("删除pid为"+id+"购物车商品的信息");
        if(result != 0){
            System.out.println(result);
            return "success";
        }else{
            System.out.println(result);
            return "error";
        }
    }

    @RequestMapping(value = "insert",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public String save(@RequestBody Cart cart){
        System.out.println("存入一个cart信息");
        int insert = 0;
        List<Cart> cartList = cartService.selectByUid(cart.getUid());
        for (Cart carts : cartList) {
            if (carts.getPid() == cart.getPid()){
                cart.setCount(carts.getCount()+cart.getCount());
                if (cart.getCount() <= cart.getLimitum()){
                    cartService.updateByPid_Uid(cart);
                    System.out.println(cart.getCount());
                    System.out.println("不添加记录，增加数量");
                    return "success";
                }else{
                    System.out.println("已达到最大数量，"+cart.getCount()+"!!!"+cart.getLimitum());
                    return "已超过库存最大数量";
                }


            }
        }

        try {
            insert= cartService.insert(cart);
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
    public String update(@RequestBody Cart cart){
        int result = 0;
        result = cartService.updateByPrimaryKey(cart);
        System.out.println("修改Cartid为"+cart.getCartid()+"购物车商品的信息");
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
        result = cartService.deleteByPrimaryKey(id);
        System.out.println("删除cartid为"+id+"用户的信息");
        if(result != 0){
            System.out.println(result);
            return "success";
        }else{
            System.out.println(result);
            return "error";
        }
    }

}
