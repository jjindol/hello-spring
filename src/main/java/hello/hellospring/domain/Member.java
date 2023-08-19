package hello.hellospring.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private Long id;
    private String name;

}

// Member 클래스는 회원의 식별자와 이름을 저장하고 반환하기 위한 데이터 객체
// 'MemberController' 와 'MemberService' 에서 회원 정보를 다룸