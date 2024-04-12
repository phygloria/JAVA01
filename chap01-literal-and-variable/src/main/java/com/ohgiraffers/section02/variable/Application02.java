package com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args){

        /*
        * 자료형이란/
        * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드이다.
        * 예) 앞으로 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        *   이러한 자료형은 기본자료형(primary type)과 참조자료형(Referance type)으로 나뉘어진다.
        * 그 중 기본자료형 8가지 부터 살펴본다.
        * */


        // 정수를 취급하는 자료형은 4가지가 있다.
        byte bnum;      // 1byte
        short snum;     // 2byte
        int inum;       // 4byte (정수의 보편형)
        long lnum;      // 8byte (큰 정수 L을 붙여서 구분함)

        // 실수를 취급하는 자료형은 2가지이다.
        float fnum;        // 4byte (실수의 서브형이라 f를 붙여서 구분함)
        double dnum;       // 8byte (실수의 기본형)

        // 문자를 취급하는 자료형은 한 가지가 있다.
        char ch;        // 2byte

        // 논리형을 취급하는 자료형은 한 가지가 있다.
        boolean isTrue;     // 1byte

        // ------------- 문자열은 기본자료형이 아니다.
        // 문자열을 취급하는 자료형 (참조 자료형)
        String str;     // 4byte

        // 변수를 초기화 하기
        bnum = 1;
        snum = 2;
        inum = 3;
        lnum = 4L;

        // 실수에 값을 초기화 하기
        fnum = 0.3f;
        dnum = 5.0;

        // 논리를 취급하는 자료형
        isTrue = true;
        isTrue = false;

        // 문자
        ch = 'A';
        ch = 97;
        // 문자에 숫자를 입력하면 아스키 코드표에 대응하여 출력된다
        System.out.println(ch);

        // 문자열을 취급하는 자료형에 값 대입
        str = "안녕하세요";
        System.out.println(str);







    }
}
