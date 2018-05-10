package com.demo.diancan.service;

import com.demo.diancan.model.Store;

import java.util.List;
import java.util.Map;

public interface StoreService {
    public int selectCount(Map<String, Object> map);

    public List<Store> selectList(Map<String, Object> map);
}
