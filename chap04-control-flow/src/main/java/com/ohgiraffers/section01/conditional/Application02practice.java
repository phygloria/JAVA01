package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application02practice {

    // 1.메서드를 만든다.
    // 2.성적을 입력받는다.
    // 3.점수의 범위를 지정한다.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        Application02practice app2 = new Application02practice();
        app2.gradeCalculator(score);
        System.out.println("");

    }

    public String gradeCalculator(int score) {

        System.out.println("점수를 입력하세요 : ");

        if(score >= 100){
            System.out.println("A+");
        }else if(score < 100 && score >= 90){
            System.out.println("A");
        }else if(score <= 89 && score >= 85){
            System.out.println("B+");
        }else if(score <= 84 && score >= 75){
            System.out.println("B");
        }else if(score <= 74 && score >= 60){
            System.out.println("C");
        }else {
            System.out.println("D");
        }

        return "";

    }


}
