package e2oy.reservapi.api.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name = "t_member")
public class Member {
    @Id
    private String memberId;
    @Column(unique = true, nullable = false)
    private String password;
    @Column(unique = true, nullable = false)
    private String name;

}
