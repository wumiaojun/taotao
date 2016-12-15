package com.taotao.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: wumiaogong
 * time: 16/12/15.
 */
@Controller
public class Acontroller {
    @RequestMapping("/show")
    public String show(){
        return "index";
    }
}
