package com.xixi.service.ItemsImpl;

import com.xixi.dao.ItemsMapper;
import com.xixi.domain.Items;
import com.xixi.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items findById(int id) {
        return itemsMapper.findById(id);
    }


}
