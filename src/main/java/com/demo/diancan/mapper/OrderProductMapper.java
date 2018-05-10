package com.demo.diancan.mapper;

import com.demo.diancan.model.OrderProduct;

public interface OrderProductMapper {
    int insert(OrderProduct record);

    int insertSelective(OrderProduct record);
}