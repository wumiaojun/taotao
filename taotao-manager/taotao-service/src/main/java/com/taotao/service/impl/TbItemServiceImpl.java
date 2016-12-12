package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.EasyUIResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.Condition;
import com.taotao.pojo.TbItem;
import com.taotao.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author: wumiaogong
 * time: 16/12/7.
 */
@Service("tbItemService")
public class TbItemServiceImpl implements TbItemService {
    @Autowired
    private TbItemMapper tbItemMapper;
    @Override
    public TbItem getTbitem(Long itemId) {
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(itemId);
        return tbItem;
    }


   public EasyUIResult  getList(){
       PageHelper.startPage(0, 10);
       List<TbItem> lists =tbItemMapper.getList();
       //取分页信息
       PageInfo<TbItem> pageInfo = new PageInfo<>(lists);
       long total = pageInfo.getTotal();
       EasyUIResult result = new EasyUIResult(total, lists);
       return result;

   }

    public List<TbItem> getListByCondition(Map paramsMap ){
        return tbItemMapper.getListByCondition(paramsMap);
    }

    @Override
    public EasyUIResult getItemList(Integer page, Integer rows) {
        Integer itemCount = tbItemMapper.getItemCount();
        Condition condition = new Condition();
        Integer beginRow =0;
        if(page.equals(0)){
            beginRow=0;
        }else{
            beginRow = (page - 1) * rows;

        }
        Integer endRow=rows;
        condition.setBeginRow(beginRow);
        condition.setEndRow(endRow);
        List<TbItem> itemList = tbItemMapper.getItemList(condition);
        EasyUIResult result = new EasyUIResult(itemCount,itemList);
        return result;
    }
    @Override
    public TbItem getItemById(Long itemId){
        return tbItemMapper.getItemById(itemId);
    }
}
