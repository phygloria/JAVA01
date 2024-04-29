package com.ohgiraffus.section02.abstractclass;

public class SmartPhone extends Product {

    @Override
    public void acsMethod() {
        System.out.println("Product 클래스의 acsMethod를 오버라이딩한 메소드를 호출함.");

    } //부모든 자식이든 어디든 있기만 하면 된다.? 문법 구현법칙?

    public void printSmartPhone(){
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드를 호출함.");
    }

}
