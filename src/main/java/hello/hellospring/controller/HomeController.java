package hello.hellospring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // 루트 경로("/")로 GET 요청이 들어왔을 때 이 메소드를 실행하도록 매핑
    public String home() {
        return "home";
    }
}

