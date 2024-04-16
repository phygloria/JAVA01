package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        Application03 app3 = new Application03();

        int result = app3.plus(x, y);

        System.out.println(result);

        int result2 = app3.minus(x, y);
        System.out.println(result2);

//====================================================================================================

        String name = "박하영";
        int age = 33;
        char gender = '여';
        String phone = "010 - 8985 - 3027";

        String result3 = app3.myInfo(name, age, gender, phone);
        System.out.println(result3);

        System.out.println(app3.myInfo("박하영", 33, '여', "010-8985-3027"));

    }


    // 두 가지 수를 더하는 함수
    // 접근제어자 + 반환타입 + 함수명(매개변수){범위:스코프=함수의몸통}
    public int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    public int minus(int x, int y) {
        int result = x - y;
        return result;
    }
//====================================================================================================

    // 자기소개 이름 전화번호 성별 나이 > 스트링타입으로 출력
    /*
     * myinfo함수
     * 이름 : 문자열
     * 나이 :  정수
     * 성별 : 문자
     * 전화번호 : '-'을 포함한 전화번호
     *
     * 위 4개의 자료형을 매개변수로 받아 하나의 문자열로 더하고 main에서 출력해주세요
     * */

    public String myInfo(String name, int age, char gender, String phone){
        String result = name + age + gender + phone;
        return result;

    }


}

