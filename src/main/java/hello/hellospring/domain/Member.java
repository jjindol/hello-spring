package hello.hellospring.domain;

public class Member {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

// Member 클래스는 회원의 식별자와 이름을 저장하고 반환하기 위한 데이터 객체
// 'MemberController' 와 'MemberService' 에서 회원 정보를 다룸