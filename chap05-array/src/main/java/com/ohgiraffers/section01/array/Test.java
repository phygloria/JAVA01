package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Test {
    /*
    * A학생의 평균 점수를 구하는 프로그램을 만들어주세요
    * 시험의 과목은 5개로 점수는 정수 단위입니다.
    * 5개 과목의 점수를 입력받고 평균을 구하여 화면에 출력합니다.
    * 예) A학생의 수학:90점, 영어:80점, 국어:100점, 과학:79점, 사회:80점이며 평균은 X입니다.
    * */

    //★과정짜기★
    // 1. 5개 과목의 점수를 입력받는다.
    /*
    * 1. 메소드를 만든다
    * 2. 정수 단위로 입력받을 수 있는 환경을 만든다
    * 3. 수학, 영어, 국어, 과학, 사회 하나씩 입력받는다.? 한번에 입력받는다?
    *    / 5개 과목. 5번 입력받는다.
    * */
    // 2. 점수의 평균을 구한다.
    /*
    * 3. 입력받은 5개 점수를 합한다
    * 4. 합한 점수를 5로 나눈다
    * */
    // 3. 화면에 출력한다.


    // 평균 = 점수합계 /  과목수
    // 과목 5개 입력받기
    // 규칙부터 찾고 파악하고 로직 짜기

    public void average(){
        //과목 5개 입력받기
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];
        int result = 0;
        for (int i = 0; i < score.length; i++){
            System.out.print("점수를 '수영국과사' 차례로 입력하세요 enter: ");
            score[i] = sc.nextInt();
            result += score[i];
        }
        double average = result / score.length;

        String[] subject = {"수학", "영어", "국어", "과학", "사회"};
        for(int i = 0; i < score.length; i++){
            System.out.print(subject[i] + " : " + score[i] + " ");
        }
        System.out.println("평균점수 : " + average);

    }

    public void avg_test(){
        Scanner sc = new Scanner(System.in);

        System.out.print("수학 점수 : ");
        int Meth = sc.nextInt();
        System.out.print("영어 점수 : ");
        int Eng = sc.nextInt();
        System.out.print("국어 점수 : ");
        int Lang = sc.nextInt();
        System.out.print("과학 점수 : ");
        int Scien = sc.nextInt();
        System.out.print("사회 점수 : ");
        int social = sc.nextInt();

        int result = (Meth + Eng + Lang + Scien + social);
        double average = (Meth + Eng + Lang + Scien + social) / 5;

        System.out.println("합계 : " + result);
        System.out.print("평균 : " + average);
    }
    // 예) A학생의 수학:90점, 영어:80점, 국어:100점, 과학:79점, 사회:80점이며 평균은 X입니다.


}

      /*int Meth = sc.nextInt();
        int Eng = sc.nextInt();
        int Lang = sc.nextInt();
        int Scien = sc.nextInt();
        int social = sc.nextInt();

        System.out.print("평균 : " + (Meth + Eng + Lang + Scien + social) / 5);
        */
