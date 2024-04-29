package com.ohgiraffus.understand.auth.impl;

import com.ohgiraffus.understand.auth.SnsAuth;
import com.ohgiraffus.understand.dto.MemberDTO;

public class GoogleAuth implements SnsAuth {

    @Override
    public boolean login(MemberDTO member) {
        System.out.println("Google Login 성공");
        return true;
    }
}
