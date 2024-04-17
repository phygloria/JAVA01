package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Sanner == 클래스:사용자정의 자료형
        // sd == 변수명 == 메모리주소 == 값
        // 가용성이 좋은 주소공간에 넣어주는게 좋다



        /*
        * inputInfo 메서드를 만들고
        * 사용자의 이름, 성별, 나이, 키 를 입력받아 main에서 출력해주세요
        *
        * 행동순서
        * 1. inputInfo 함수 먼저 만들기 ~ (회원정보)를 입력하는 함수
        *   // 접근제어자 + 반환타입 + 메서드명(){}
        * 2. 사용자에게 입력받기 ~ 입력받는 기능이 함수내에 포함되어야함
        *   // Scanner sc = new Scanner();
        * 3. 키, 나이, 성별, 이름을 입력받아 문자열로 합친다
        *   // double 키;
        *   // int 나이;
        *   // char 성별;
        *   // String 이름;
        * 4. 문자열로 반환한다
        *   return
        * */

        Application01 app1 = new Application01();
        String info = app1.inputInfo();
        System.out.println(info);



    }


    public String inputInfo(){

        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력해주세요 : " );
        String name = sc.nextLine();

        System.out.println("당신의 나이를 입력해주세요 : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("당신의 성별을 입력해주세요 : ");
        char gender = sc.nextLine().charAt(0);

        System.out.println("당신의 키를 입력해주세요 : ");
        Double height = sc.nextDouble();


        return "당신의 이름은 " + name + "입니다. \n" + "당신의 성별은 " + gender + " 입니다 \n" + "당신의 나이는 " + age + "세 입니다 \n" + "당신의 키는 " + height + "입니다.";

    }


}
