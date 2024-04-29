package com.ohgiraffus.section04.use;

public class FireCar extends Car implements Soundable {
    @Override
    public void go() {
        System.out.println("Fire Car가 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("Fire Car가 멈춥니다.");
    }

    @Override
    public void horn() {
        System.out.println("Fire Car가 나갑니다 빠아아앙아아앙빵아앙아아ㅏ아");
    }


}
