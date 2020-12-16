package com.test.controller;

import com.test.po.*;
import com.test.service.AdminsService;
import com.test.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@RestController
@RequestMapping("/admins")
public class AdminsController {

    @Autowired
    private AdminsService adminsService;

    @RequestMapping(value = "selectAll",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Admins> selectData(){
        List<Admins> adminsList = adminsService.selectByExample(new AdminsExample());
        return adminsList;
    }

    @RequestMapping(value = "findById/{id}",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Admins findById(@PathVariable("id")Integer id){
        return adminsService.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "save",method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    @ResponseBody
    @CrossOrigin
    public String save(@RequestBody Admins admins){
        System.out.println("存入一名Admin信息");
        int insert = 0;
        try {
            insert= adminsService.insert(admins);
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
    public String update(@RequestBody Admins admins){
        int result = 0;
        result = adminsService.updateByPrimaryKey(admins);
        System.out.println("修改name为"+admins.getAdminname()+"用户的信息");
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
        result = adminsService.deleteByPrimaryKey(id);
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
