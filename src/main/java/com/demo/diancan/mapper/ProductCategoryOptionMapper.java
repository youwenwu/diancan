package com.demo.diancan.mapper;

import com.demo.diancan.model.ProductCategoryOption;

public interface ProductCategoryOptionMapper {
    int insert(ProductCategoryOption record);

    int insertSelective(ProductCategoryOption record);
}