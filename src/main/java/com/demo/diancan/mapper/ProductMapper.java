package com.demo.diancan.mapper;

import com.demo.diancan.model.Product;

public interface ProductMapper {
    int insert(Product record);

    int insertSelective(Product record);
}