package e2oy.reservapi.api.repository;

import e2oy.reservapi.api.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
