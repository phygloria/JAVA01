package com.ohgiraffus.section02.encapsulation.practice01;

public class Application02 {

    public static void main(String[] args) {

        Book[] books = new Book[3];
        books[0] = new Book();
        books[0].bookName = "책이름 1";
        books[0].writer = "책1 저자";
        books[0].bookNum = 123;

        books[1] = new Book();
        books[1].bookName = "책이름 2";
        books[1].writer = "책2 저자";
        books[1].bookNum = 456;

        books[2] = new Book();
        books[2].bookName = "책이름 3";
        books[2].writer = "책3 저자";
        books[2].bookNum = 789;


        Human yong = new Human();
        yong.name = "하영";
        yong.getBook = books[0];
        yong.phoneNum = 010-2222-3333;


        System.out.println(yong);


    }


}
//[실습] 도서대여프로그램
// 책의 종류
// 책 개체 // 클래스
//      이름
//      저자
//      번호
// *사람 // 클래스
//      책
//      책을 대여
//      책을 반납
// *도서관 // 클래스
//      책
//      책을 등록
//      책을 대여
//      책을 반납