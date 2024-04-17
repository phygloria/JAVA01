package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application01priactice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력해주세요 : ");
        double num1 = sc.nextInt();

        System.out.println("연산기호를 입력해주세요 : ");
        char ch1 = sc.next().charAt(0);
        sc.nextLine();

        System.out.println("두 번째 정수를 입력해주세요 : ");
        double num2 = sc.nextInt();

        double result;
        if (ch1 == '+'){
            result = num1 + num2;
            System.out.println(result);
        } else if (ch1 == '-'){
            result = num1 - num2;
            System.out.println(result);
        } else if (ch1 == '*'){
            result = num1 * num2;
            System.out.println(result);
        } else if (ch1 == '/'){
            result = num1 / num2;
            System.out.println(result);
        } else if (ch1 == '%'){
            result = num1 % num2;
            System.out.println(result);
        } else {
            System.out.println("오류");
        }

    }

}
