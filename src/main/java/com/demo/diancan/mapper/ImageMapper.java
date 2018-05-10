package com.demo.diancan.mapper;

import com.demo.diancan.model.Image;

public interface ImageMapper {
    int insert(Image record);

    int insertSelective(Image record);
}