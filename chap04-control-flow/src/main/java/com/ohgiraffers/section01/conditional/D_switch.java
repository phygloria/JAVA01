package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

// D_switch라는 클래스를 모두가 사용할 수 있도록 만든다.
public class D_switch { // D_switch의 시작
    // 클래스 내부 속성

    // testSimpleSwitchStatement라는 반환값이 없는 메서드를 모두가 사용할 수 있도록 만든다.
    public void testSimpleSwitchStatement(){ // testSimpleSwitchStatement 메서드의 시작
        /*
        * [switch문의 표현식] // if 조건문과 흡사함
        * switch(비교대상값 //비교'기준'을 입력){
        *   case 비교값1 : 비교값1이 참인 경우 실행할 구문; break;
        *   case 비교값2 : 비교값2이 참인 경우 실행할 구문; break;
        *   default : case에 모두 해당하지 않는 경우 ; break;        *
        * }
        * */

        //사용자한테 값을 입력받을 수 있는 객체를 생성함
        Scanner sc = new Scanner(System.in);

        // 화면에 첫번째 명령을 출력함
        System.out.println("첫 번째 정수 입력 : ");
        // 사용자가 입력한 값을 정수로 받아서 first에 대입함
        int first = sc.nextInt();
        // 화면에 두번째 명령을 출력함
        System.out.println("두 번째 정수 입력 : ");
        // 사용자가 입력한 값을 정수로 받아서 second에 대입함
        int second = sc.nextInt();
        // 화면에 세번째 명령을 출력함
        System.out.println("연산기호 입력 : ");
        // 사용자가 입력한 연산기호를 문자로 받아서 op에 대입함
        char op = sc.next().charAt(0);
        // *아래의 계산기를 완성합니다.
        // *연산은 + - * / 가 가능하며 이외는 계산 불가능이라는 결과를 화면에 출력합니다.

        switch (op){ //op라는 변수를 기준으로 아래의 값과 일치하는지 확인함
            // op가 +와 같다면 first + second 결과를 화면에 출력함
            case '+' : System.out.println(first + second); break;
            // op가 -와 같다면 first - second 결과를 화면에 출력함
            case '-' : System.out.println(first - second); break;
            // op가 *와 같다면 first * second 결과를 화면에 출력함
            case '*' : System.out.println(first * second); break;
            // op가 /와 같다면 first / second 결과를 화면에 출력함
            case '/' : System.out.println(first / second); break;
            // op가 위의 수식에 모두 만족하지 않으면 ""내용을 출력함
            default: System.out.println("입력오류"); break;
        }

    } // testSimpleSwitchStatement 메서드의 종료



    // 계산기를 만들고 결과를 반환. (switch를 이용함) 반환된 결과는 Application02에서 출력해주세요.
    // + - / * 만 제공하고 일치하는 연산이 없는 경우 연산불가 라는 결과를 출력. -> 반환값을 0.0으로 합니다.

    // ★과정 짜기★
    // 1. 값을 입력받음
    // 2. 첫 수 입력받기
    // 3. 두 번째 수 입력
    // 4. 연산기호 입력
    // 5. 연산기호를 비교
    // 6. 반환

    public double switchCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int firstNum = sc.nextInt();

        System.out.println("연산기호 입력 : ");
        char opA = sc.next().charAt(0);

        System.out.println("두 번째 정수 입력 : ");
        int secondNum = sc.nextInt();

        double result = 0.0;

        switch (opA){
            case '+' : System.out.println(result = firstNum + secondNum); break;
            case '-' : System.out.println(result = firstNum - secondNum); break;
            case '*' : System.out.println(result = firstNum * secondNum); break;
            case '/' : System.out.println(result = firstNum / secondNum); break;
            default: System.out.println("연산불가"); break;
        }

        return result;

    }


    // 등급 계산기 프로그램 if 사용
    // main에서 학생의 성적을 입력받고 아래의 메서드에서 학생의 등급을 화면에 출력해주세요
    // 100 = A+
    // 100~91 = A
    // 90~85 = B+
    // 84~75 = B
    // 74~60 = C
    // 60미만 = D
    // F는 없다.

    // ★과정 짜기★
    // 1.메서드를 만든다.
    // 2.성적을 입력받는다.
    // 3.점수의 범위를 지정한다.
    public void gradeCal(int score){
        String grade;

        if(score == 100){
            grade = "A+";
        }else if(score >= 90 && score < 100){
            grade = "A";
        }else if(score >= 80 && score < 90){
            grade = "B+";
        }else if(score >= 70 && score < 80){
            grade = "B";
        }else if(score >= 60 && score < 70){
            grade = "C+";
        }else { grade = "D"; }

    }



} // D_switch의 종료
