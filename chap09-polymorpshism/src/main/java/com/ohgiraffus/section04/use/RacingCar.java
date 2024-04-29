package com.ohgiraffus.section04.use;

public class RacingCar extends Car{
    @Override
    public void go() {
        System.out.println("Racing Car가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("Racing Car가 멈춥니다.");
    }
}
