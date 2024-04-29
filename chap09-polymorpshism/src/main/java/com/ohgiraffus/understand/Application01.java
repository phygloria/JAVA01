package com.ohgiraffus.understand;

import com.ohgiraffus.understand.auth.impl.GoogleAuth;
import com.ohgiraffus.understand.auth.impl.KakaoAuth;
import com.ohgiraffus.understand.auth.impl.NaverAuth;
import com.ohgiraffus.understand.dto.MemberDTO;
import com.ohgiraffus.understand.service.MemberService;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        MemberService memberService;
        Scanner scanner = new Scanner(System.in);

        do{
            MemberDTO memberDTO;

            System.out.println("로그인 프로그램 시작");
            System.out.println("1. 구글 로그인");
            System.out.println("2. 네이버 로그인");
            System.out.println("3. 카카오 로그인");
            System.out.println("9. 프로그램 종료");
            System.out.println("인증 수단 선택");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println("아이디 입력 : ");
            String id = scanner.nextLine();
            System.out.println("비밀번호 입력 : ");
            String pwd = scanner.nextLine();
            //위에서 선언한 memberDTO를 초기화 해줌
            memberDTO = new MemberDTO(id, pwd);

            String result = "";
            switch(choice) {
                case 1 : memberService = new MemberService(new GoogleAuth());
                        result = memberService.loginMember(memberDTO);
                        break;

                case 2 : memberService = new MemberService(new NaverAuth());
                        result = memberService.loginMember(memberDTO);
                        break;

                case 3 : memberService = new MemberService(new KakaoAuth());
                        result = memberService.loginMember(memberDTO);
                        break;

                case 9 : System.out.println("종료하시겠습니까?");


                default : result = "로그인 실패";
                        break;
            }
            System.out.println(result);

        }while (false);

    }

}
