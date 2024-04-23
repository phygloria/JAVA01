package com.ohgiraffus.section03.abstraction.problem3;

public class Application01 {

    public static void main(String[] args) {
        Car ram = new Car();
        ram.setName("람보르기니");
        Car po = new Car();
        po.setName("포르쉐");

        CarRacer h_young = new CarRacer();

        h_young.setCar(ram); // ram을 지정해줬기 때문에 po가 출발하든말든 상관없다.
        h_young.myCarInfo();

        h_young.startUp();
        po.startUp();

        h_young.go();
        po.go();

        h_young.stop();
        po.stop(); //

        h_young.shutDown();





    }
}
