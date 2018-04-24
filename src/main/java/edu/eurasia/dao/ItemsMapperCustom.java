package edu.eurasia.dao;

import edu.eurasia.po.Items;
import edu.eurasia.po.ItemsCustom;
import edu.eurasia.po.ItemsQueryVo;

import java.util.List;

/**
 * @author: Y
 * @date: 2018/4/23
 */
public interface ItemsMapperCustom {
    /**
     * 功能描述:
     *
     * @param:
     * @return:
     */
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
