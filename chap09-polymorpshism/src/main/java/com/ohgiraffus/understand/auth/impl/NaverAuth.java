package com.ohgiraffus.understand.auth.impl;

import com.ohgiraffus.understand.auth.SnsAuth;
import com.ohgiraffus.understand.dto.MemberDTO;

public class NaverAuth implements SnsAuth {
    @Override
    public boolean login(MemberDTO member) {
        System.out.println("NaverAuth login 성공");
        return true;
    }
}
