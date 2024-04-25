package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;

public class OrderService {
    private final OrderRepository orderRepository = new OrderRepository();
    // 서비스계층
    // 비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.

    public String order(OrderDTO[] orders){
        // 배열은 반복문 for로 검증해준다.
        for (OrderDTO orderDTO : orders) {
            if(orderDTO.getPrice() <= 0){
                return "땅파서 장사하냐?";
            }
        }
//        if(!orderDTO.getMenuName().equals("아메리카노")){
//            return "주문실패";
//        }

        String result = orderRepository.order(orders);

        return result;

    }

//    public OrderDTO orderRead(int no){
//        orderDTO orderViewOne = orderRepository.orderRead(no);
//        return orderViewOne;
//    }

    public String orderDelete(int no) {
        String delete = orderRepository.orderDelete(no);
        return delete;

    }


    public ArrayList orderRead() {

        ArrayList menuList = orderRepository.orderRead();

        return menuList;
    }

    public OrderDTO orderDetail(int no){
        OrderDTO order = orderRepository.orderDetail(no);
        return order;
    }


//    public String orderDetail(OrderDTO orderDTO){
//
////        if(!orderDTO.getMenuName().equals("네")) {
////            return "조회실패";
////        }
//
//        String viewAll = orderRepository.orderDetail();
//        return viewAll;
//    }



}
