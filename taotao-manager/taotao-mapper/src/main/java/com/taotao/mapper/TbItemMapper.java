package com.taotao.mapper;

import com.taotao.pojo.Condition;
import com.taotao.pojo.TbItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TbItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    TbItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);

    List<TbItem> getListByCondition(Map paramsMap);

    List<TbItem>  getList();

    List<TbItem> getItemList(Condition condition);

    Integer getItemCount();

    TbItem getItemById(Long itemId);
}