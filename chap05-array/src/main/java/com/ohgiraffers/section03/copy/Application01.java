package com.ohgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args) {
        //얕은 복사 주소값을 공유한다.
        String[] goldSideName = {"김재석", "송재희", "황정한"};
        /*System.out.println(goldSideName[0]);*/
        String[] names = goldSideName;
        System.out.println(names);
        System.out.println(goldSideName);

        goldSideName[0] = "김효주";
        System.out.println(goldSideName[0]);
        System.out.println(names[0]);
        System.out.println("-------------------- 깊은 복사 ---------------------");

        // -----------------
        // 깊은 복사의 개념

        //주소값 초기화
        names = new String[3];

        goldSideName = new String[]{"김재석", "송재희", "황정한"}; //임시 재사용
        // for each
        int i = 0;
        for (String name : goldSideName) {
            names[i] = name;
            i++;

        }
        goldSideName[0] = "이상우";

        System.out.println(goldSideName[0]); //이상우
        System.out.println(names[0]);  //이상우

    }
}
