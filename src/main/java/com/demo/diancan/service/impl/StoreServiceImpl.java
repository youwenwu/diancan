package com.demo.diancan.service.impl;

import com.demo.diancan.mapper.StoreMapper;
import com.demo.diancan.model.Store;
import com.demo.diancan.service.StoreService;
import com.demo.diancan.util.MapUtil;
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

    @Override
    public void create(Map<String, Object> map) {
        String storeName = MapUtil.getString(map, "storeName");
        String storeLongitude = MapUtil.getString(map, "storeLongitude");
        String storeLatitude = MapUtil.getString(map, "storeLatitude");
        String storeLocation = MapUtil.getString(map, "storeLocation");
        String storeDesc = MapUtil.getString(map, "storeDesc");
        String storeTel = MapUtil.getString(map, "storeTel");
        Integer imageId = MapUtil.getInteger(map, "imageId");
        Store store = new Store();
        store.setStoreName(storeName);
        store.setStoreLongitude(storeLongitude);
        store.setStoreLatitude(storeLatitude);
        store.setStoreLocation(storeLocation);
        store.setStoreDesc(storeDesc);
        store.setStoreTel(storeTel);
        store.setImageId(imageId);
        store.setStatus(0);

        storeMapper.insert(store);
    }

    @Override
    public Store selectByName(String storeName) {
        Store store = new Store();
        store.setStoreName(storeName);
        List<Store> list = storeMapper.select(store);
        if (list == null || list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
