package com.ohgiraffus.section02.encapsulation.problem01;

import javax.sound.midi.SysexMessage;

public class Monster {
    String name;

//    int hp;
    int hp;


    //Monster의 Hp가 0보다 큰 값만 입력할 수 있도록 하여 버그를 막자.
    public void setHp(int hp){ // setHp시작
        if(hp > 0){
            this.hp = hp; //this는 예약어. '나'를 지칭한다. this는 메소드 내부에서 클래스의 hp를 지칭해준다.헷갈리지않게.
        }else{
            System.out.println("몬스터의 체력은 0보다 작을 수 없습니다.");
        }

    } // setHp종료

    public int getHp(){
        return this.hp;
    }


}





