package e2oy.reservapi.api.service;

import e2oy.reservapi.api.domain.Member;
import e2oy.reservapi.api.dto.MemberDto;
import e2oy.reservapi.api.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final ModelMapper stModelMapper;

    @Override
    public String saveUser(MemberDto userDto) {
        userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        memberRepository.save(stModelMapper.map(userDto, Member.class));
        return userDto.getMemberId();
    }
}
