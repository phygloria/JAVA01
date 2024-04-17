package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application01 {


    public static void main(String[] args) {
        A_if aIf = new A_if();
        aIf.testSimpleIfStatement();

        /*
         * 계산기 만들기
         * 두 수와 수식을 입력받아
         * 수식에 맞는 연산을 수행하는 프로그램을 만들어주세요
         * */

        Application01 app = new Application01(); //해당 클래스를 메모리에 올리겠다고 선언하기
        String result = app.calculator(); //반환타입을 지정? 불러옴?
        System.out.println(result); // 값을 출력

    }

    //만들기 순서
    // 1. calculator 메서드를 만든다.
    public String calculator() {
        // 입력받을 수 있는 기능을 추가한다.
        Scanner sc = new Scanner(System.in);
        // 2-1. 첫번째 수를 입력받는다.
        int first = sc.nextInt();
        // 2-2. 두번째 수를 입력받는다.
        int second = sc.nextInt();
        // 3. 연산 기호를 입력받는다.
        char operator = sc.nextLine().charAt(0);
        // 4. 연산 기호를 확인한다.

        double result;
        if (operator == '+') {
            // 5. 연산을 진행한다.
            result = first + second;
        } else if (operator == '-') {
            // 5. 연산을 진행한다.
            result = first - second;
        } else if (operator == '*') {
            // 5. 연산을 진행한다.
            result = first * second;
        } else if (operator == '/') {
            // 5. 연산을 진행한다.
            result = first / second;
        } else {
            return "연산식 오류";
        }

        // 6. 변환한다.

        return ""+result;
    }


}


