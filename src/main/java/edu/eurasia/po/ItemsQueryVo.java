package edu.eurasia.po;

/**
 * 商品包装对象
 * @author: Y
 * @date: 2018/4/23
 */
public class ItemsQueryVo{
    /**
     * 商品信息
     */
    private Items items;
    /**
     *  为了系统可扩展性，对原始生成的po进行扩展
     */
    private  ItemsCustom itemsCustom;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public ItemsCustom getItemsCustom() {
        return itemsCustom;
    }

    public void setItemsCustom(ItemsCustom itemsCustom) {
        this.itemsCustom = itemsCustom;
    }
}
