package e2oy.reservapi.api.service;

import e2oy.reservapi.api.dto.MemberDto;

public interface MemberService {
    String saveUser(MemberDto userDto);
}
