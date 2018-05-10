package com.demo.diancan.mapper;

import com.demo.diancan.model.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}