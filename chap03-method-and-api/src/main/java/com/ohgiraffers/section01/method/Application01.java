package main.java.com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args) {
        /*
        * 메소드
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */

        System.out.println("main() 시작됨....");
        // 함수는 어떤 입력값을 넣어도 동일한 역할을 수행하는 아이다.

        //Application01 //우리가 만든 클래스는 -> 하나의 자료형으로 만들 수 있다. =레퍼런스타입 자료형
        Application01 app1 = new Application01();
        app1.methodA();

        // app1.main();
        // . 점은 참조연산자 /대상이 가지고 있는 것들 중에서 찾음.

        System.out.println("main() 종료됨....");

    }

    public void methodA(){
        System.out.println("methodA() 시작됨");
        methodB();
        System.out.println("methodA() 종료됨");
        //퍼블릭은 접근자. 보이드는 변환없음. 메소드에이는 이름. 소괄호열닫. 중괄호는 범위지정.


    }


    public void methodB(){

        System.out.println("methodB() 시작됨");
        methodC();
        System.out.println("methodB() 종료됨");

    }

    public void methodC(){
        System.out.println("methodC() 시작됨");
        System.out.println("methodC() 종료됨");

    }



}

// 모든 메서드는 리턴문(return;)을 만나야 끝나지만, 보이드형에서는 리턴할게 없어서 묵인됨.
// 인텔리제이가 자동추가하거나 불필요할 때 회색처리해서 알려줌.