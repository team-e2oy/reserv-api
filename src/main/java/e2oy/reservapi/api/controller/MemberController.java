package e2oy.reservapi.api.controller;

import e2oy.reservapi.api.dto.MemberDto;
import e2oy.reservapi.api.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    
    private final MemberService memberService;

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok().body("test");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok().body("login");
    }

    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody MemberDto memberDto) {
        String memberId = memberService.saveUser(memberDto);
        return ResponseEntity.ok().body(memberId);
    }

}
