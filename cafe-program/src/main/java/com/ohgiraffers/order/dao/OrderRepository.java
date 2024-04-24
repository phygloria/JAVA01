package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {
    private final ArrayList orders = new ArrayList();

    public String order(OrderDTO orderDTO) {
         boolean id = orders.contains("");
         orders.add(orderDTO);

        if(!id == orders.contains("")){
            return "등록실패";
        }
        return "등록성공";


    }

//    public String order(OrderDTO orderDTO) {
//        // 0
//        int oldNum = orders.size();
//        orders.add(orderDTO);
//        if(oldNum > orders.size()){
//            return "등록실패";
//        }
//        return "등록성공";
//        /*// 1
//        int current = orders.size();*/
//    }

    public String orderDetail() {

        System.out.println(orders);
        boolean view = orders.contains(toString());

        if(!view == orders.contains(toString())){
            return "조회실패";
        }
        return "조회성공";
    }

}
