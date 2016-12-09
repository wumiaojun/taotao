package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: wumiaogong
 * time: 16/12/8.
 */
@Controller
public class PageController {

    @RequestMapping("/page")
    public String showIndex(){
        System.out.println("我问问");
        return "index";
    }

    @RequestMapping("/{page}")
    public String showIndex(@PathVariable String page){
        System.out.println("我问问");
        return page;
    }

}
