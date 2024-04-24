package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.Date;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OrderController orderController = new OrderController();
        boolean order = true;
        String result = "";


        while(order){

            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 조회");
            System.out.println("5. 주문 전체조회");
            System.out.println("어떤 메뉴를 동작하시겠습니까?");
            int input = sc.nextInt();
            sc.nextLine();

            switch (input){
                case 1 : //주문등록

                    System.out.println("주문자 이름 등록 : ");
                    String id = sc.nextLine();
                    System.out.println("주문할 메뉴 이름 등록");
                    String menuName = sc.nextLine();
                    System.out.println("수량을 입력해주세요 : ");
                    int quantity = sc.nextInt();
                    System.out.println("가격을 입력해주세요 : ");
                    int price = sc.nextInt();



                    OrderDTO orderfinal = new OrderDTO(id, menuName, quantity, price);
                    result = orderController.order(orderfinal);
                    System.out.println(orderfinal);



                    break;
                case 2 : //주문삭제
                    orderController.orderDelete();
                    break;
                case 3 : //주문수정
                    orderController.reOrder();
                    break;
                case 4 : //주문조회
//                    System.out.println("조회할 주문 입력");
//                    String orderId = sc.nextLine();
//
//                    result = orderController.orderRead(orderDTO);
                    break;

                case 5 : //주문전체조회
                    OrderDTO orderDTO = new OrderDTO();
                    System.out.println("전체조회 하시겠습니까? : ");
                    orderDTO.setMenuName(sc.nextLine());


                    //*System.out.println(orderDTO);

                    result = orderController.orderDetail(orderDTO);
                    break;

                default:
                    System.out.println("입력이 잘못되었습니다");
                    break;
            }


            System.out.println(result);
            System.out.println("주문을 종료하시겠습니까?");
            order = sc.nextBoolean();

        }
    }
}
