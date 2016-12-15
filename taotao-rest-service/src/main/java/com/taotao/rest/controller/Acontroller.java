package com.taotao.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: wumiaogong
 * time: 16/12/14.
 */
@Controller
@RequestMapping("/show")
public class Acontroller {

    @RequestMapping("/aaas")
    public String show(){

        System.out.println("===进来了吗====");

        return "aaa";
    }

}
