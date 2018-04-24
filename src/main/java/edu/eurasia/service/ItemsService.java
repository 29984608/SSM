package edu.eurasia.service;

import edu.eurasia.po.Items;
import edu.eurasia.po.ItemsCustom;
import edu.eurasia.po.ItemsQueryVo;

import java.util.List;

/**
 * @author: Y
 * @date: 2018/4/23
 */
public interface ItemsService {
    /**
     * 商品查询列表
     */
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
