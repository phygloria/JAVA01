package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

import java.util.ArrayList;

public class OrderController {

    private final OrderService orderService = new OrderService();


    public String order(OrderDTO[] orders){
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        // 배열을 사용하는 경우 for문으로 검증
        for (OrderDTO orderDTO : orders) {
            if(orderDTO.getMenuName().equals("")){
                return "메뉴를 정해주세요";
            }
            if(orderDTO.getQuantity() <= 0){
                return "수량을 입력해주세요";
            }
        }

        // service 로직으로 넘김
        String result = orderService.order(orders);
        return result;
    }


    public String orderDelete(int no){
        String delete = orderService.orderDelete(no);

        return delete;
        // "주문삭제";
    }

    public String reOrder(){
        return "주문수정";
    }

    public String orderRead(){

        ArrayList orderList = orderService.orderRead();
        String viewAll = "주문 목록 : " + orderList.toString();
        return viewAll;

    }

    public String orderDetail(int no){

        // 서비스 로직으로 넘기기
        if(no < 0){
            return "메뉴 번호를 잘못 입력하였습니다.";
        }
        OrderDTO orderDTO = orderService.orderDetail(no);
        if(orderDTO == null){
            return "존재하지 않는 주문입니다.";
        }

        return orderDTO.toString(); //★
    }

//    public String orderDetail(OrderDTO orderDTO){
//
//        // 서비스 로직으로 넘기기
//        ArrayList orderList = orderService.orderRead();
//        String viewAll = "주문 목록 : " + orderList.toString();
//        return viewAll;
//
//    }

}
