package com.taotao.service.impl;

import com.taotao.common.EUTreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * author: wumiaogong
 * time: 16/12/12.
 */
@Service("itemCatService")
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EUTreeNode> getCatList(Long parentId) {
        List<EUTreeNode> list = new ArrayList<EUTreeNode>();
        List<TbItemCat> catList = tbItemCatMapper.getCatList(parentId);
        //把列表转换成treeNodelist
        for (TbItemCat tbItemCat : catList) {
            EUTreeNode node = new EUTreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            System.out.println(tbItemCat.getIsParent());

            node.setState(tbItemCat.getIsParent()?"closed":"open");
            list.add(node);
        }

        return list;
    }
}
