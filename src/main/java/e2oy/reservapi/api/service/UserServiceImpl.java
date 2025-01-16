package e2oy.reservapi.api.service;

import e2oy.reservapi.api.domain.User;
import e2oy.reservapi.api.dto.UserDto;
import e2oy.reservapi.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper stModelMapper;

    @Override
    public String saveUser(UserDto userDto) {
        userDto.setPw(passwordEncoder.encode(userDto.getPw()));
        userRepository.save(stModelMapper.map(userDto, User.class));
        return userDto.getUserId();
    }
}
