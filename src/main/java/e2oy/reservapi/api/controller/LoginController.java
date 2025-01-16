package e2oy.reservapi.api.controller;

import e2oy.reservapi.api.dto.UserDto;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {
    
    @GetMapping("")
    public String test() {
        UserDto.UserDtoBuilder test = UserDto.builder().userId("test");
        return "";
    }
}
