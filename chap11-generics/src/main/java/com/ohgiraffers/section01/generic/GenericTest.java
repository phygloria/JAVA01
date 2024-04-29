package com.ohgiraffers.section01.generic;

public class GenericTest<T> {
    /*
    * 제네릭 설정은 클래스선언부 마지막에 다이아몬드 연산자를 이용하여 작성하게 된다.
    * 다이아몬드 연산자 내부에 작성하는 여문자는 관례상 대문자로 작성한다. + 관례상 Type T 넣음
    * */
    // value 타입이 결정되지 않은 상태.
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericTest{" +
                "value=" + value +
                '}';
    }
}
