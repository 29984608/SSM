package edu.eurasia.controller;

import edu.eurasia.po.Items;
import edu.eurasia.po.ItemsCustom;
import edu.eurasia.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Y
 * @date: 2018/4/23
 */
@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{
        List<ItemsCustom> list = itemsService.findItemsList(null);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("items",list);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
