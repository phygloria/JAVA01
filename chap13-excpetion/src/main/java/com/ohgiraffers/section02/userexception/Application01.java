package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMeonyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;


public class Application01 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

//        try {
//
//            et.checkEnoughMemory(100,200);
//
//            try {
//                et.checkEnoughMemory(100, -200);
//            }catch (Exception e){
//                System.out.println("정신체려~~~~");
//            }
//
//
//        } catch (Exception e) {
//            System.out.println("상품가격을 정수로 다시 입력");
//
//        }

//        try {
//            et.checkEnoughMoney(-100,200);
//        }catch (PriceNegativeException e){
//            System.out.println("제품가격이 음수야");
//        }catch (MoneyNegativeException e){
//            System.out.println("가진 돈이 음수야");
//        }catch (NotEnoughMoneyException e){
//            System.out.println("제품이 가진 돈 보다 비싸");
//        }catch (Exception e){
//            System.out.println("뭐든 에러");
//        }

//        try {
//            et.checkEnoughMoney(100,200);
//            et.checkEnoughMoney(200,-200);
//
//            et.checkEnoughMoney(10,200);
//        } catch (Exception e) {
//            // Exception은 모든 예외의 최상위 타입으로 아래의 예외를 검사하지 않음
//        } catch (PriceNegativeException e) {
//            System.out.println("제품가격이 음수야");
//        } catch (MoneyNegativeException e) {
//            System.out.println("제품가격이 음수야");
//        } catch (NotEnoughMeonyException e) {
//            System.out.println("제품이 가진 돈 보다 비싸");
//        }
//
//        System.out.println("쇼핑종료");

        try {
            et.checkEnoughMoney(100,200);
            et.checkEnoughMoney(200,-200);

            et.checkEnoughMoney(10,200);
        } catch (PriceNegativeException e) {
            System.out.println("제품가격이 음수야");
        } catch (MoneyNegativeException e) {
            System.out.println("제품가격이 음수야");
        } catch (NotEnoughMeonyException e) {
            System.out.println("제품이 가진 돈 보다 비싸");
        }

        System.out.println("쇼핑종료");



    }
}
