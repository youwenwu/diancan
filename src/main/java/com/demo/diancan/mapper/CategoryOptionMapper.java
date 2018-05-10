package com.demo.diancan.mapper;

import com.demo.diancan.model.CategoryOption;

public interface CategoryOptionMapper {
    int insert(CategoryOption record);

    int insertSelective(CategoryOption record);
}