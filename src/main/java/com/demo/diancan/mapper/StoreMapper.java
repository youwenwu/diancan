package com.demo.diancan.mapper;

import com.demo.diancan.model.Store;

import java.util.List;
import java.util.Map;

public interface StoreMapper {
    int insert(Store record);

    int insertSelective(Store record);

    int selectCount(Map<String, Object> map);

    List<Store> selectList(Map<String, Object> map);

    List<Store> select(Store store);
}