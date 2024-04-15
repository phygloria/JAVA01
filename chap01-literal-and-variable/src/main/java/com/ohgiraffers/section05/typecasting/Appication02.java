package com.ohgiraffers.section05.typecasting;

public class Appication02 {

    public static void main(String[] args) {
        /*
        * 강제형변환
        * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환된다.
        * */


        /*
        * 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        * 1. 강제 형변환 규칙
        *  1-1. 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
        *  1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
        *  1-3. 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        *  1-4. 논리형은 강제 형변환 규칙에서 제외된다.
        * */

        byte num = 1;
        char charAt = 'A'; // 문자는 정수로 변환이 가능하다.
        // 자바에서 정수를 취급하는 기본 단위는 int
        // 문자는 == 정수 == int


        long lnum = 9L;
        int inum = (int)lnum;

        short snum = (short)inum;
        byte bnum = (byte)snum;
        // 자동 형변환이 발생된다.
        snum = bnum;

        // -------------
        // 실수를 정수로 변경 시 강제 형변환이 필요하다.
        double dnum = 8.8;
        float fnum = (float)dnum;

        // ------- 문자형을 int 미만의 크기 변수에 저장할 때 강제 형변환이 필요하다.
        char ch = 'a'; //1byte char a를 정수 변환시 97이 된다.
        byte bnum2 = (byte)ch; //1byte

        int result = ch; // int는 4byte char는 문자로는 1byte 정수로는 4byte















    }
}
