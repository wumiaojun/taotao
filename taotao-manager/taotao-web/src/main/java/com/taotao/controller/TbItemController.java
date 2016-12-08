package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author: wumiaogong
 * time: 16/12/7.
 */
@Controller
@RequestMapping("/items")
public class TbItemController {

    @Autowired
    private TbItemService tbItemService;

    @RequestMapping("/item/{item}")
    @ResponseBody
    public TbItem getTbItem(@PathVariable Long item){

        System.out.println("进来了吗");
       return tbItemService.getTbitem(item);
    }
}
