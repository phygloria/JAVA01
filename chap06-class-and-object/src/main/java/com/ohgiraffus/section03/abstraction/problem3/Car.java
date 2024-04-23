package com.ohgiraffus.section03.abstraction.problem3;

public class Car {

    private boolean isOn;
    private int speed;

    private String name; // 알트인서트 게터세터

    public String carName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startUp(){
        if(isOn){
            System.out.println("이미 시동이 걸려있습니다");
        }else {
            this.isOn = true;
            System.out.println("시동이 걸렸습니다. 이제 출발할 준비가 되었습니다.");
        }
    }

    public void shutDown(){
        if(this.isOn){
            if(this.speed > 0){
                System.out.println("차를 멈추고 다시 종료");
            }else{
                this.isOn = false;
                System.out.println("차가 멈춰있는 상태입니다.");
            }
        }else{
            System.out.println("이미 시동이 꺼져있는 상태입니다.");
        }
    }

    public void go(){
        if(this.isOn){
            this.speed +=18;
            System.out.println("현재 시속은 " + this.speed + "km/h 입니다.");
        }else{
            System.out.println("차에 시동을 걸어주세요");
        }

    }

    public void stop(){
        if(this.isOn){
            if(this.speed>0){
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다.");
            }else{
                System.out.println("차가 멈춰있는 상태입니다.");
            }
        }else{
            System.out.println("?.");
        }
    }
}






