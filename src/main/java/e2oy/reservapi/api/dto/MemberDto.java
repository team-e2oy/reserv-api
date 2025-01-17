package e2oy.reservapi.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MemberDto {
    private String memberId;
    private String password;
    private String name;
}
