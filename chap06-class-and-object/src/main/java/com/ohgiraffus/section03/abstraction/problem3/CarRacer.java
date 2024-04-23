package com.ohgiraffus.section03.abstraction.problem3;

public class CarRacer { //운전자

    private Car car; //운전자에게 정의해준 Car라는 필드 + 알트+인서트 +게터앤세터 엔터

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void startUp(){ //시동
        this.car.startUp();
    }

    public void shutDown(){ //시동끔
        this.car.shutDown();
    }

    public void go(){ //출발
        this.car.go();
    }

    public void stop(){ //멈춤
        this.car.stop();
    }


    public void myCarInfo(){
        System.out.println(this.car.carName());
    }

}
