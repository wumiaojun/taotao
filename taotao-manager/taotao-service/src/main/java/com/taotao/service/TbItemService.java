package com.taotao.service;

import com.taotao.common.EasyUIResult;
import com.taotao.pojo.TbItem;

import java.util.List;
import java.util.Map;

/**
 * author: wumiaogong
 * time: 16/12/7.
 */
public interface TbItemService {
    public TbItem getTbitem(Long itemId);
    EasyUIResult  getList();

    List<TbItem> getListByCondition(Map paramsMap);

    EasyUIResult getItemList(Integer page,Integer rows);

    TbItem getItemById(Long itemId);
}
