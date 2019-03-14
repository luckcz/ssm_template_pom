package com.kaicom.dao;

import com.kaicom.pojo.Orders;

public interface OrdersMapper {

    Orders selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}