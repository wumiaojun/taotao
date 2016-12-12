package com.taotao.service;

import com.taotao.common.EUTreeNode;

import java.util.List;

/**
 * author: wumiaogong
 * time: 16/12/12.
 */
public interface ItemCatService {
    List<EUTreeNode> getCatList(Long parentId);
}
