package e2oy.reservapi.api.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "t_user")
public class User {
    @Id
    private String userId;
    @Column(unique = true, nullable = false)
    private String pw;
    @Column(unique = true, nullable = false)
    private String name;

}
