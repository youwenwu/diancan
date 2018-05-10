package com.demo.diancan.mapper;

import com.demo.diancan.model.Desk;

public interface DeskMapper {
    int insert(Desk record);

    int insertSelective(Desk record);
}