package hello.hellospring.controller;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 해당 클래스가 컨트롤러임을 나타냄
public class HelloController {

    @GetMapping("hello-mvc") // 'hello-mvc' 경로로 GET 요청이 들어오면 메소드 실행
    public String helloMvc(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template"; // hello-template 뷰를 렌더링
    }


    @GetMapping("hello-string")
    @ResponseBody // body 영역에 내용을 그대로 넣어줌
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }


    @GetMapping("hello-api") // 객체를 넘기면 JsonConverter 동작
    @ResponseBody // 응답 결과를 HTTP 응답 본문에 직접 작성하도록 지정
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    @Getter
    @Setter
    static class Hello {
        private String name;
    }
}
