package e2oy.reservapi.api.repository;

import e2oy.reservapi.api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
