package com.ohgiraffus.section02.encapsulation.problem01;

public class Application01 {

    public static void main(String[] args) {

        Monster drunkTiger = new Monster();
        drunkTiger.name = "드렁큰타이거";
        drunkTiger.hp = -100;

        System.out.println(drunkTiger.name);
        System.out.println(drunkTiger.hp);
        //-- 직접 필드에 접근하면 다음과 같이 -100을 입력해도 오류가 생기지 않는다.

        Monster monster = new Monster();
        monster.name = "주황버섯";
        monster.setHp(-100); // 클래스로 접근. ()로 접근. 설정한 대로 나옴.
//        System.out.println(monster.hp);
//        monster.hp = -100; // .은 참조연산자. monster필드를 참조하여 hp에 직접 접근했다. 값을 바로 입력.=>값을 바꿀 수 있음.
        System.out.println(monster.getHp());

    }


}
