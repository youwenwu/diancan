package com.demo.diancan.mapper;

import com.demo.diancan.model.ProductCategory;

public interface ProductCategoryMapper {
    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);
}