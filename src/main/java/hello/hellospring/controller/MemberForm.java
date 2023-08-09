package hello.hellospring.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm { // 멤버 등록 시 사용되는 폼 데이터를 담는데 사용

    private String name; // private 으로 선언되어 외부 접근 x
}
