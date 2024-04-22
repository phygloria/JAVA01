package com.ohgiraffers.section02.demensinal;

public class Application01 {

    public static void main(String[] args) {
        /*
        * 다차원 배열
        * 타차원 배열 2차원 이상의 배열을 의미한다.
        *
        * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
        * 즉, 2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
        * 더 많은 차원의 배열은 사용할 수 있지만 일반적으로 2차원 배열보다 더 높은 차원의 배열은 사용빈도가 적다.
        * */

        /*
        * 2차원 배열을 사용하는 방법.
        * 1. 배열의 주소를 보관할 래퍼런스 변수를 선언(stack)
        * 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heep)
        * 3. 각 인덱스에서 관리하는 배열을 할당(heep)하여 주소를 보관하는 배열에 저장
        * 4. 생성한 여러 개의 1차원 배열을 차례로 접근해서 사용
        * 표현식
        * 자료형[][] 변수명 = new 자료형[길이][길이]
        * */

        //2차원배열식 표현
        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        iarr1 = new int[3][3];
        System.out.println(iarr1[0][1]);

        //iarr2 = new int[3][5];

        iarr1 = new int[3][];
        iarr1[0] =new int[5];
        iarr1[1] =new int[4];
        iarr1[2] =new int[2];
        //iarr1[3] =new int[6];

        System.out.println(iarr1[3][0]);


        /*
        * [실습 - 바둑판 만들기]
        * 1. 바둑판 셋팅하기
        * 2. 바둑판의 길이 30x30
        * 3. 바둑돌 가져오기
        * */
        
        /*iarr2 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                
        };*/

        int[][] badookboard = new int[30][30];
        boolean chk[][] = new boolean[30][30];

        for (int x = 0; x < 30; x++) {
            System.out.println(" ");
            for (int y = 0; y < 30; y++) {

                if (x == 0 && y == 0)// 왼쪽 위 모서리막기
                    badookboard[x][y] = '┌';
                else if (x == 29 && y == 29)// 오른쪽 아래 모서리막기
                    badookboard[x][y] = '┘';
                else if (x == 29 && y == 0)// 왼쪽 아래 모서리막기
                    badookboard[x][y] = '└';
                else if (x == 0 && y == 29)// 오른쪽 위 모서리막기
                    badookboard[x][y] = '┐';
                else if (x == 0)// 위에 막기
                    badookboard[x][y] = '┬';
                else if (x == 29)// 아래 막기
                    badookboard[x][y] = '┴';
                else if (y == 0)// 왼쪽 막기
                    badookboard[x][y] = '├';
                else if (y == 29)// 오른쪽 막기
                    badookboard[x][y] = '┤';
                else
                    badookboard[x][y] = '┼';

                chk[x][y] = true;

                System.out.print(badookboard[x][y] + "  ");
            }

        }




    }
}
