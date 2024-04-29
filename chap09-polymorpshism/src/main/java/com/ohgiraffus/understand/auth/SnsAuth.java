package com.ohgiraffus.understand.auth;

import com.ohgiraffus.understand.dto.MemberDTO;

public interface SnsAuth {
    boolean login(MemberDTO member);

}
