package e2oy.reservapi.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDto {
    
    private String userId;
    private String pw;
    private String name;

}
