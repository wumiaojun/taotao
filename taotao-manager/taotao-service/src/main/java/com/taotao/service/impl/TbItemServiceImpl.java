package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    /*public List<TbItem> getList(){
        PageHelper.startPage(1, 10);

        //紧跟着的第一个select方法会被分页
        List<Country> list = countryMapper.selectIf(1);
        PageInfo page = new PageInfo(list);

    }*/
}
