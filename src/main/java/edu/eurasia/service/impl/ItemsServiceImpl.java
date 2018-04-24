package edu.eurasia.service.impl;

import edu.eurasia.dao.ItemsMapperCustom;
import edu.eurasia.po.Items;
import edu.eurasia.po.ItemsCustom;
import edu.eurasia.po.ItemsQueryVo;
import edu.eurasia.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Y
 * @date: 2018/4/23
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapperCustom itemsMapperCustom;
    @Override
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }
}
