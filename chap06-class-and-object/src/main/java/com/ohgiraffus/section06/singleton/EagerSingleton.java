package com.ohgiraffus.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("Eager 생성됨");
    }

    public static EagerSingleton getInstance(){
        return singleton;
    }


}
