package com.ohgiraffers.section01.array;

public class Application01 {

    public static void main(String[] args){
//                          //ㄴ위에 이 줄이 배열이었다.
//        /*
//        * 배열이란?
//        * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)이다.
//        * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
//        * */
//
//        //식빵(1개)[](묶음)
//        /*
//        * 배열의 사용 이유
//        * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
//        * 1. 연속된 메모리 공간을 관리할 수 없다.
//        * 2. 반복문을 이용한 연속 처리가 불가능하다.
//        * */
//
//        String bread = "식빵";
//        String bread1 = "식빵";
//        String bread2 = "식빵";
//        String bread3 = "식빵";
//        String bread4 = "식빵";
//        String bread5 = "식빵";
//        String bread6 = "식빵";
//        String bread7 = "식빵";
//        String bread8 = "식빵";
//        String bread9 = "식빵";
//
//        // 배열을 사용한다면
//        // 배열의 표현식
//        // 자료형[] 변수명 = new 자료형[길이]; //new 동적인 메모리공간 필요 = Heap
//        String[] breads = new String[10];
//        breads[0] = "식빵";
//        breads[1] = "식빵";
//        breads[2] = "식빵";
//        breads[3] = "식빵";
//        breads[4] = "식빵";
//        breads[5] = "식빵";
//        breads[6] = "식빵";
//        breads[7] = "식빵";
//        breads[8] = "식빵";
//        breads[9] = "식빵";
//
//        /*for (int i = 0; i <= 10; i++){
//            System.out.println(breads[i]);
//        }*/
//
//        // 배열을 선언하다.
//        int[] iarr = new int[5]; // 0~4
//        char carr[] = new char[10]; // 0~9 //두가지 방식 []의 위치. 둘다 가능
//        iarr[2] = 10; //iarr의 세번째(0,1,2)에 10의 값을 대입한다.
//        /*int result = iarr[2]; //result에 iarr의 2번째(0,1,2)의 을 대입한다.*/
//
//        System.out.println(iarr); // 변수는 주소다. //클래스형 메모리에서는 값을 무엇이라 지정할 수 없다.
//                                  // 그냥 출력했을 때 [I@4c873330 이렇게 나오는 것이 주소값
//        System.out.println(iarr[2]); // 특정값을 출력하고싶을 때 주소의 어느 방인지 지정해준다.
//
//        iarr = null;
//        System.out.println(iarr); // iarr초기화. 방 뺀것. 비워준것. null로 초기화 후에는 방에 값을 넣거나 지정해도 출력이 안된다.
//        // 메모리 청소. 메모리 비우기. heap영역 소멸. 메모리 존재안함. 가비지 컬렉터가 가져감.
//
//        int result = 100;
//        int newArray[] = new int[result]; //[result] result가 현재 100이기때문에 100짜리 배열이다.
//        for (int i=0; i < newArray.length; i++){ //length는 100으로 반환된다? 배열의 길이.
//            newArray[i] = 10; // 100개의 배열에 10을 대입
//        }

     /*Test avg = new Test();
     avg.average();*/

     Test ag_t = new Test();
     ag_t.avg_test();




    }


}


