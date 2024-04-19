package com.ohgiraffers.section03.branching;

public class A_break {

    /*
    * break문 실행 흐름을 확인하기 위한 용도의 기능을 제공 분기문(break) 기본 흐름에 대해 확인
    *
    * */

    public void testSimpleBreakStatement(){
        int i = 2;
        test : //while문에 test 라는 이름을 붙여줌
        while(true){
            int x = 0;
            while(x<=9){

                if(i>=10){
                    break test; //종료시킨다.
                }

                if(x>=5){
                    break;
                } // 모든 구구단이 4까지만 연산되게한다. : break;은 들어가있는 스코프의 조건으로 상위조건을 종료시킨다.

                if(x==0){
                    x++; //증감되므로 조건에 따라 0이후는 continue; 아래로 실행한다.
                    continue;
                    //if가 참일때 실행되는데 continue;아래는 실행x 바로 상위 스코프(while)로 올라가서 실행.
                }

                System.out.println(i + " * " + x + " = " + i*x);
                x++;
            }

            i++;

        }
    }
}
