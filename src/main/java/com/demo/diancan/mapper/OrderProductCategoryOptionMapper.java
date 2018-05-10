package com.demo.diancan.mapper;

import com.demo.diancan.model.OrderProductCategoryOption;

public interface OrderProductCategoryOptionMapper {
    int insert(OrderProductCategoryOption record);

    int insertSelective(OrderProductCategoryOption record);
}