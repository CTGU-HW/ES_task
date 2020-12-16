package com.test.controller;

import com.alibaba.druid.sql.dialect.mysql.ast.expr.MySqlIntervalExpr;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.test.po.Products;
import com.test.po.ProductsExample;
import com.test.po.User;
import com.test.po.UserExample;
import com.test.service.ProductsService;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "selectAll",method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public List<User> selectData(){

        List<User> userList = userService.selectByExample(new UserExample());
        System.out.println("获取所有User信息");
        return userList;

    }

    @RequestMapping(value = "findByPage/{page}/{size}", method = RequestMethod.GET)
    public PageInfo<User> listByPage(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        //PageHelper.startPage(pageNum, pageSize);这段代码表示，程序开始分页了，pageNum默认值是1，pageSize默认是10，意思是从第1页开始，每页显示10条记录。
        PageHelper.startPage(page, size);
        // 查询列表的结果
        List<User> userList = userService.getByPage(page);
        // 得到分页的结果对象
        PageInfo<User> p = new PageInfo<>(userList);
        return p;
    }

    @RequestMapping(value = "findById/{id}",method = RequestMethod.GET,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public User findById(@PathVariable("id")Integer id){
        System.out.println("获取Uid为"+id+"用户的信息");
        return userService.selectByPrimaryKey(id);

    }

    @RequestMapping(value = "save",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public String save(@RequestBody User user){
        System.out.println("存入一名User信息");
        int insert = 0;
        try {
            insert= userService.insert(user);
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
    public String update(@RequestBody User user){
        int result = 0;
        result = userService.updateByPrimaryKey(user);
        System.out.println("修改uid为"+user.getUid()+"用户的信息");
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
        result = userService.deleteByPrimaryKey(id);
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
