package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMeonyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        /*
        * Scanner는 시스템에서 입력을 받을 수 있는 기능을 수행한다.
        * 그러나 이러한 기능은 애플리케이션이 실해하는 과정에서 잘못딘 임의의 값이 들어갈 수 있다.
        * 그렇기 때문에 항상 Scanner.close()를 호출하여 리소스를 제거해줘야 한다.
        * */
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("제품 가격을 입력해주세요");
            int price = sc.nextInt();
            System.out.println("가진 돈을 입력해주세요");
            int money = sc.nextInt();

            et.checkEnoughMoney(price, money);

        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException가 발생함");
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException가 발생함");
        } catch (NotEnoughMeonyException e) {
            System.out.println("NotEnoughMeonyException가 발생함");
        }finally { // finally 블럭은 오류가 있던 없던 항상 실행하는 블럭이다.
            /*
            * 위에 설명한 내용과 같이 Scanner는 리소스를 사용하면 닫아주어야 한다.
            * 그렇기 때문에 try 블럭에서 닫는 경우 에러가 발생되었을 때 닫히지 않는 경우가 발생할 수 있어
            * finally 블럭에서 scanner에할당된 리소스를 제거하여 오류가 발생하던 발생하지 않던 리소스를 제거하게 된다.
            * */
            sc.close();
            System.out.println("오류가 나던 말던 나는 나의 길을 간다.");
        }
//        *// sc가 클로즈되어서 더이상 쓸 수 없다고 에러남
//        *// sc.nextLine();

        //확장문법
        /*
        * 위의 finally는 주로 리소스를 제거하는 경우 많이 사용하기 때문에
        * 이를 축약한 확장 문법으로 try블럭에 ()소괄호 부분에 리소스할당이 필요한 인스턴스를 생성하게된다면
        * try and catch 블럭에 오류가 있던 없던 리소스를 제거하게 된다.
        * 즉, sc.close()를 항상 마지막에 호출한다는 이야기이다.
        * */
        try(Scanner sc2 = new Scanner(System.in)) {
            System.out.println("제품 가격을 입력해주세요");
            int price = sc2.nextInt();
            System.out.println("가진 돈을 입력해주세요");
            int money = sc2.nextInt();

            et.checkEnoughMoney(price, money);

        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException가 발생함");
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException가 발생함");
        } catch (NotEnoughMeonyException e) {
            System.out.println("NotEnoughMeonyException가 발생함");
        }

        System.out.println("즐쇼~~~~~~~~~");
    }

}
