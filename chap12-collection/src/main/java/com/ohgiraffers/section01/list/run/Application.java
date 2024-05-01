package com.ohgiraffers.section01.list.run;


import java.util.*;

public class Application {

    public static void main(String[] args) {

        ArrayList alist = new ArrayList();
        List list = new ArrayList();

        Collection clist = new ArrayList();

        alist.add("Apple");
        alist.add(448);
        alist.add(55.468);
        alist.add(new Date());

        System.out.println(alist);

        //list의 길이를 확인할때 size를 이용한다.
        System.out.println(alist.size());

        for (int i = 0; i < alist.size(); i++) {
            // 특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }


        String target = "안녕"; // "사용자 입력값";
        // 특정 인덱스의 값을 추가한다.
        alist.add(0, target);
        System.out.println(alist.get(0));

        alist.remove(0);
        // 특정 인덱스의 값을 삭제한다.
        for (int i = 0; i < alist.size(); i++) {
            // 특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }

        System.out.println();
        // 값을 수정한다
        alist.set(0, "이것을 수정함");
        for (int i = 0; i < alist.size(); i++) {
            // 특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }


        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grape");
//        stringList.add(10); //에러
        System.out.println();
        System.out.println(stringList);

        Collections.sort(stringList); // 컬렉션스는 자바 클래스이다. //컬렉션은 인터페이스 타입이다.
        // 소트. 배열 첫알파벳을 따서 아스키코드변환 후 순서대로 재배열한다. 알파벳순. 그래서 원본배열에 영향을 주게된다

        System.out.println(stringList);

        stringList = new LinkedList<>(stringList);
        /*
        * Iterator란?
        * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용된다.
        * 반복자 라고 불리우며, 반복문을 이용해서 목록을 하나씩 꺼내오는 방식으로 사용하기 위함이다.
        * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        * 인덱스를 사용하지 않고 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
        * next : 다음 요소를 반환
        * */
        //              4.대입     2.링크드리스트로 바꿔줌(1.스트링리스트를) / 3.역순으로배열하기
        Iterator<String> dIter = ((LinkedList<String>) stringList).descendingIterator();

//        while (dIter.hasNext()) {
//            System.out.println(dIter.next());
//        }
//        System.out.println(dIter);

        List<String> descList = new ArrayList<>();
        while (dIter.hasNext()) {
            descList.add(dIter.next());
        }

        for (int i = 0; i < descList.size(); i++) {
            System.out.println(descList.get(i));
        }

    }
}
