package com.ohgiraffers.section05.typecasting;

public class Application04 {

    public static void main(String[] args){
        int inum = 200;
        byte bnum = (byte) inum; // 작은형으로 강제변형하면서 데이터 손실(ex오버플로우)이 있을 수도 있는것 감안해야한다.
        // 데이터가 손실되어도 강제로 바꾸겠다는 명령
        System.out.println(bnum);


    }
}
