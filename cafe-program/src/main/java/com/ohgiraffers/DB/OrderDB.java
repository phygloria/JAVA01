package com.ohgiraffers.DB;

import com.ohgiraffers.order.dto.OrderDTO;
import java.util.ArrayList;

public class OrderDB {

    private final ArrayList orders;
    private static OrderDB orderDB = new OrderDB();

    private OrderDB() {
        orders = new ArrayList();      //아메리카노, 1000, 3
        OrderDTO orderDTO = new OrderDTO();
        orders.add(orderDTO);

    }

    public static OrderDB getInstance(){
        return orderDB;
    }

    public void setItem(OrderDTO orderDTO){
        orders.add(orderDTO);
    }

    public ArrayList getOrders(){
        return orders;

    }

}
