package com.ohgiraffus.section04.constructor;

public class User {

    // 접근제어자 public, private, ... , ...

    private String name;
    private int age;
    private String phone;
    // private는 개인적인. 해당클래스에서만 사용가능. + 알트인서트로 게터&세터 추가 = 필드에 대하여 캡슐화 but,은닉성 무시


    public User(){ //01
        //빈 메소드01 생성 = 클래스가 기본적으로 갖고 있는 것인데 아래02생성자처럼 규칙이 생성되면 자동으로 빈 메소드는 없어짐.
        // 그렇게되면 Application01에서 기본생성자를 가져와 만들수없다. 아래02규칙이 있어서. 그래서 빈 메소드01를 수동으로 추가해줘야한다.
    }

    //생성자 만들기
    //접근제어자+클래스이름+괄호+중괄호
    public User(String name, int age, String phone){ //02
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
