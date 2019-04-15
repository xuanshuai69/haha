package com.xixi.dao;

import com.xixi.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsMapperTest {
    @Test
    public void findByIdTest(){
        ApplicationContext ApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsMapper itemsMapper = ApplicationContext.getBean(ItemsMapper.class);
        Items items = itemsMapper.findById(1);
        System.out.println("items = " + items.getName());
    }
}