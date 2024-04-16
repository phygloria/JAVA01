package main.java.com.ohgiraffers.section03.math;

public class Application01 {

    public static void main(String[] args){
        // 수학기능 만들어져있는 것을 가져다 쓰는 것. 이렇게 가져다 쓰는 것을 '에이피아이'라고 한다.
        /*
        * api란?
        * Application Priograming Interface는 응용프로그램에서 사용할 수 있도록
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        * 쉽게 말해서 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 jdk를 설치하면 사용할 수 있도록 제공해놓은 소스코드(클래식이나 인터페이스)들을 의미한다.
        * 더 쉽게 누군가 작성해놓은 소스코드를 가져다 사용하는 것이다.
        * */

        System.out.println(java.lang.Math.abs(-7));
                         //자바라는 패키지 안에 랭 패키지 안에 메쓰 클래스//abs는 메소드함수 (static이 붙어있다)

    }

}
