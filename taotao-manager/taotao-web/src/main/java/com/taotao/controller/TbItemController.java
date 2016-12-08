package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.TbItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * author: wumiaogong
 * time: 16/12/7.
 */
@Controller
@RequestMapping("/items")
public class TbItemController {

    final static Logger logger  =  LoggerFactory.getLogger(TbItemController.class );
    @Autowired
    private TbItemService tbItemService;

    @RequestMapping("/item/{item}")
    @ResponseBody
    public TbItem getTbItem(@PathVariable Long item){
        System.out.println("范围======");
               logger.debug( "现在的时间是 {}" ,  new Date().toString());

                logger.info( " This time is {}" ,  new Date().toString());

                logger.warn( " This time is {}" ,  new Date().toString());

                logger.error( " This time is {}" ,  new Date().toString());

        System.out.println("进来了吗");
       return tbItemService.getTbitem(item);
    }
}
