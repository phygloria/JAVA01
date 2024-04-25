package com.ohgiraffers.order.dao;

import com.ohgiraffers.DB.OrderDB;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderRepository {
    private final ArrayList orders = new ArrayList();
    private final OrderDB orderDB = OrderDB.getInstance();

//    public String order(OrderDTO orderDTO) {
//         boolean id = orders.contains("");
//         orders.add(orderDTO);
//
//        if(!id == orders.contains("")){
//            return "등록실패";
//        }
//        return "등록성공";
//    }

    public String order(OrderDTO[] orders) {
        // 0
        int oldNum = orderDB.getOrders().size();

        for (OrderDTO orderDTO: orders) {
            orderDB.setItem(orderDTO);
        }

        if(oldNum >= orderDB.getOrders().size()){
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

    public String orderDelete(int no) {
        int oldSize = orderDB.getOrders().size();
        orderDB.getOrders().remove(no);
        if(orderDB.getOrders().size() >= oldSize){
            return "주문 취소가 실패하였습니다.";
        }
        return "주문이 취소되었습니다.";

    }



    public ArrayList orderRead() {

        return orderDB.getOrders();
    }


    public OrderDTO orderDetail(int no) {
        OrderDTO order = (OrderDTO) orderDB.getOrders().get(no);
        return order;

    }

//    public String orderDetail() {
//
//        System.out.println(orders);
//        boolean viewAll = orders.contains(toString());
//
//        if(!viewAll == orders.contains(toString())){
//            return "조회실패";
//        }
//        return "조회성공";
//    }

}
