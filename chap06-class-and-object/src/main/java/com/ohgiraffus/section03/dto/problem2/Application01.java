package com.ohgiraffus.section03.dto.problem2;


public class Application01 {

    public static void main(String[] args){

        MemberDTO song = new MemberDTO();
        song.setAge(20);
        song.setGender('여');
        song.setAddress("인사동");
        song.setPhone("010-0000-2222");
        song.setName("송재희");

        MemberDTO kim = new MemberDTO();
        kim.setAge(19);
        kim.setGender('남');
        kim.setName("김재석");
        kim.setAddress("고잔동");
        kim.setPhone("010-1111-3333");

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.addMember(song);
        memberRepository.addMember(kim);
        memberRepository.print();

    }


}
