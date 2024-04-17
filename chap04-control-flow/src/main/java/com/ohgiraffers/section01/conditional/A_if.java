package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public static void testSimpleIfStatement() {

        /*
         * [if 표현식]
         * if(조건식){
         *   조건식이 참인 경우에 실행할 명령문
         * }
         *
         * 조건식 : 결과가 무조건 true 혹은 false가 나오는 연산식을 의미한다.
         *
         * */
        // Scanner를 쓸때 항상 ctrl+space bar를 누르고 import를 먼저 해야한다.
        //Scanner sc = new Scanner(System.in);
        //System.out.println("값을 입력해주세요 : ");

        //int num = sc.nextInt();
        // 2의 배수면 n은 2의 배수입니다.
        // 0이면 n은 0입니다.
        // 2의 배수가 아니면 n은 2의 배수가 아닙니다.

        // if((num * 2 == 0) || (num * 2 != 0)){
        //System.out.println(num + "은 2의 배수가 아닙니다. with if");
        //}else{
        //System.out.println(num + "은 2의 배수 입니다. with else");
        //}


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력해주세요 : ");
        int num1 = sc.nextInt();

        System.out.println("연산기호를 입력해주세요 : ");
        char ch = sc.next().charAt(0);
        sc.nextLine();

        System.out.println("두 번째 정수를 입력해주세요 : ");
        int num2 = sc.nextInt();

        //double result = (num1) + (ch) + (num2);
        //if (ch == '+') || (ch == '-') || (ch == '*') || (ch == '/') || (ch == '%') || {
        //            System.out.println((num1 ch num2));
        //}else{
        System.out.println("Error");
        //}


    }

}



