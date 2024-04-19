package com.ohgiraffers.section02.looping;

public class B_while {

    public void testSimpleWhileStatement(){
        /*
        * [While문 표현식]
        * 초기식;
        * while(조건식){
        *   조건식을 만족하는 경우 수행할 구문(반복할 구문);
        *   증감식;
        * }
        *
        * while(조건식){
        *   조건식을 만족하는 경우 수행할 구문
        * }
        * */


        int i =1;
        while(i <= 10){ // 반복해야 하는 대상의 길이를 알 수 없을 때 사용한다.
            System.out.println(i);
            i++;
        }

        /*for(; true ;){
            //무한반복
            //(; boolean 타입으로 나오기만 하면 됨. ;)
        }*/

        int j = 2;
        while(j <= 9){ //while문의 시작
            int k = 1;
            while(k <= 9) { //중첩w문의 시작
                System.out.println("구구단 = " + j + " * "  + k + " = " +  j*k);
                k++;
            } //중첩w문의 종료
          j++;
        } //while문의 종료

        //while문으로 구구단 만들기
        //1.초기식 작성
        //2.while문의 조건식
        //3.중첩 while 조건식
        //4. 연산식 j * k
        //5. 출력
        //6. 중첩 while 증감식
        //7. while 증감식







    }
}
