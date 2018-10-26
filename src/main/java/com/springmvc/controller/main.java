package com.springmvc.controller;

import com.springmvc.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class main {

    @Resource
    AdminService adminService;
    @RequestMapping("/")
    @ResponseBody
    public Integer index(){
        adminService.getAdmin(1);
        return adminService.getAdmin(1).getId();
    }
    @RequestMapping("/index")
    public String mv(){
        return "index";
    }

}
