package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement(){
        /*
        * [for문 표현식]
        * for(초기식; 조건식; 증감식){
        *  // 조건식이 참인 경우 실행할 구문 == 반복할 구문
        *
        * }
        * */

        //실행순서 1▽▽▽  2▽▽▽  4▽▽▽
        for(int i = 1; i<=10; i++){
            //실행순서 3▽▽▽
            for (int x = 1; x <= 10; x++){
                System.out.println("천원 단위 " + x);
            }
            System.out.println("만원 단위 : " + i);
        }
        //두번째 실행부터는 2>3>4 순서로 실행된다
    }

    // 구구단을 만들어주세요!

    // 2와 2를 곱한다
    // 2와 3을 곱한다
    // 2와 4를 곱한다
    // ...반복

    public void gugudan(){ //2단 스코프 시작

        for(int a = 1; a <= 9; a++){
            System.out.println("구구단 2단 : " + a * 2);
        }
    } //2단 스코프 종료

    // 구구단!
    public void gugudan2(){ //구구단2 스코프 시작

        for(int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.println("구구단 " + i + "x" + j + "= " + (i * j));
            }
        }
    } //구구단2 스코프 종료


    public void gugudan3(){ //구구단3 스코프 시작

        int i = 2;
        for(int j = i; j<=9; j++){
            if(j%i == 0)
            for (int y = 0; y <= 9; y++){
                System.out.println("배수 " + j + "x" + y + "= " + j*y);
            }
        }
    }//구구단3 스코프 종료





    public void gugudan4(){ //구구단4 스코프 시작

        for(int i =2; i<=9; i++){
            for (int x = 0; x<=9; x+=i){
                if(x!=0) {
                    System.out.println("이거 맞나요? " + i + "x" + x + "= " + i * x);
                }
            }
        }
    } //구구단4 스코프 종료

    // 10명의 이름과 나이를 입력 받아 화면에 출력하기
    // 예) 이름 000 나이 00
    // ★순서짜기★
    // 0. 입력받을 공간을 만든다.
    // 1. 이름을 입력받는다.
    // 2. 나이를 입력받는다.
    // 3. 화면에 출력한다.

    public void nameage(){

        Scanner sc = new Scanner(System.in);

        for(int i =1 ; i<=10; i++) {
            System.out.println("이름을 입력하세요." + i + " : ");
            String name = sc.nextLine();
            System.out.println("나이를 입력하세요." + i + " : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("이름 : " + name + " 나이 : " + age);

        }


    }


}
