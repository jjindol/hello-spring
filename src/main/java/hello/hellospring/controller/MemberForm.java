package hello.hellospring.controller;

public class MemberForm { // 멤버 등록 시 사용되는 폼 데이터를 담는데 사용

    private String name; // private 으로 선언되어 외부 접근 x

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
