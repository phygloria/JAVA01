package com.ohgiraffers.section01.literal;

public class Application02 {
    public static void main(String[] args){
        // 2+2 , 2-2 , 2*2 , 2/2
        System.out.println(2+2);
        System.out.println(2-2);
        System.out.println(2*2);
        System.out.println(2/2);

        // 123 % 10
        System.out.println(123 % 10);

        // 1.23 + 1.23
        // 1.23 - 1.23
        // 1.23 * 1.23
        // 1.23 / 1.23
        // 1.23 % 1.0

        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 1.23);
        System.out.println(1.23 * 1.23);
        System.out.println(1.23 / 1.23);
        System.out.println(1.23 % 1.0);

        // "123" + "12"
        System.out.println("123" + "12");
        // "" 문자열이기 때문에 빼거나 곱하거나 나누거나 목연산x
        System.out.println("123 12");
        // "123" + 12 (문자열과 붙어서 문자열로 변환인식한다)
        System.out.println("123"+12);




    }
}
