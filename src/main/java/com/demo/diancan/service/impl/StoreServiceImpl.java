package com.demo.diancan.service.impl;

import com.demo.diancan.mapper.StoreMapper;
import com.demo.diancan.model.Store;
import com.demo.diancan.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreMapper storeMapper;

    @Override
    public int selectCount(Map<String, Object> map) {
        return storeMapper.selectCount(map);
    }

    @Override
    public List<Store> selectList(Map<String, Object> map) {
        return storeMapper.selectList(map);
    }
}
