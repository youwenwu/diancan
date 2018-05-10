package com.demo.diancan.mapper;

import com.demo.diancan.model.Category;

public interface CategoryMapper {
    int insert(Category record);

    int insertSelective(Category record);
}