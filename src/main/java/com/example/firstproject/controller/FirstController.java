package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 1. 컨트롤러 먼저 선언
public class FirstController {

    @GetMapping("/hi") // 3. 겟맵핑으로 연결시켜준다
    public String niceToMeetYou(Model model) { // Model 임포트
        model.addAttribute("username", "hongpark");
        return "greetings"; // 2. 리턴값으로 먼저 페이지의 이름을 따서 만들어 준다(greetings.mustache) - [view templates]
                            // greetings templates/greetings.mustache -> 브라우저로 전송!
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }
}
