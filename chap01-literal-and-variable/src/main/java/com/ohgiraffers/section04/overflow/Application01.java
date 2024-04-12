package com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args) {

        // 자료형 별 값의 최대 범위를 벗어나는 경우 발생한 carry를 버림처리하고 sing bit를 반전시켜 최소값으로 순환시킴

        byte num1 = 127;
        System.out.println("byte num : " + num1);
        num1++;
//        num1++ = num1+=1;

        System.out.println("byte num : " + num1);



        int firstNum = 1000000;
        int secondNum = 7000000;
        System.out.println("firstNum * secondNum = " + (firstNum * secondNum));
        //2,147,483,647 ~ -2,147,483,648

        long longMulti = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + longMulti);

        long resuti = (long) firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + resuti);





    }
}
