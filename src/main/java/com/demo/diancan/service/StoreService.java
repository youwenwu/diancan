package com.demo.diancan.service;

import com.demo.diancan.model.Store;

import java.util.List;
import java.util.Map;

public interface StoreService {
    int selectCount(Map<String, Object> map);

    List<Store> selectList(Map<String, Object> map);

    void create(Map<String, Object> map);

    Store selectByName(String storeName);
}
