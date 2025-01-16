package e2oy.reservapi.api.dto;

import e2oy.reservapi.api.domain.User;
import e2oy.reservapi.global.config.ModelConfig;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;

class UserDtoTest {

    ModelMapper modelMapper = new ModelConfig().stModelMapper();

    @Test
    public void make() {
        UserDto userDto = UserDto.builder()
                .userId("유저아이디")
                .pw("1234")
                .name("정재호")
                .build();
        System.out.println(userDto);
        System.out.println(userDto.toString());
        
        User map = modelMapper.map(userDto, User.class);
        System.out.println(map.getUserId());
    }

}