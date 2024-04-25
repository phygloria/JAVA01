package com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application01 {

    public static void main(String[] args){
        /*
        * 시스템 요구사항
        * 1. 여러 명의 회원 정보를 받아 한 번에 여러 회원 정보를 등록
        * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
        * */
        // 사용자 정보를 입력받기
        Scanner sc = new Scanner(System.in);

        //클래스 만들기 -> 멤버서비스/ 멤버/ 멤버레지스터/ 멤버레파지토리/ 멤버파인더


        MemberService memberService = new MemberService();
        while(true){
            System.out.print("회원관리 프로그램 ");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            int no = sc.nextInt();
            switch(no){
                case 1:memberService.signUpMembers(); break;
                case 2:memberService.showAllMembers(); break;
                case 9: System.out.println("프로그램 종료"); break;
                default:
                    System.out.println("잘못된 번호 입력");
                    break;
            }
        }

    }
}
