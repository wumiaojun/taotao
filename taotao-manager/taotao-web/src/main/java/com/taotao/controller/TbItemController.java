package com.taotao.controller;

import com.taotao.common.EasyUIResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.TbItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * author: wumiaogong
 * time: 16/12/7.
 */
@Controller
@RequestMapping("/item")
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

    @RequestMapping("getlist")
    @ResponseBody
    public List getList(){
        Map map=new HashMap();
        EasyUIResult listByCondition = tbItemService.getList();
        System.out.println("长度是: "+listByCondition.getTotal());
        List<TbItem> rows = (List<TbItem>)listByCondition.getRows();

        for(TbItem tb:rows){
            System.out.println("名称: "+tb.getTitle());

        }

    return rows;
    }

    @RequestMapping("getbycondition")
    @ResponseBody
    public List<TbItem> getLIsts(){
        Map map=new HashMap();
        List list = new ArrayList();
        list.add(3);
        map.put("list",list);
        List<TbItem> listByCondition = tbItemService.getListByCondition(map);
        for(TbItem tb:listByCondition){
            System.out.println("名称: "+tb.getTitle());

        }
        System.out.println(listByCondition.size());
        return listByCondition;
    }

    @RequestMapping("/list")
    @ResponseBody
    public EasyUIResult getItemlist(@RequestParam(defaultValue="1")Integer page,
                                    @RequestParam(defaultValue="30")Integer rows) throws Exception {
        //查询商品列表
        EasyUIResult result = tbItemService.getItemList(page, rows);

        return result;
    }
    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        TbItem tbItem = tbItemService.getItemById(itemId);
        return tbItem;
    }
}
