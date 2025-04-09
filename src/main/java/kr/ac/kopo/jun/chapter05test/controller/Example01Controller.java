package kr.ac.kopo.jun.chapter05test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class Example01Controller {
    @GetMapping("/exam01")
    public String requestMethod(@RequestParam("id") String userId,@RequestParam("passwd") String userPw, Model model) {
        model.addAttribute("data1", "@RequestParam 연습");
        model.addAttribute("data2", "요청 파라미터에 전달된 id값:" + userId
                                                           + "<br>요청 파라미터에 전달된 pwd값:" + userPw);
        return "viewPage";
    }

    @GetMapping("/exam02")
    public String requestMethod2(@RequestParam(value = "id", defaultValue = "Annoymous") String userId,@RequestParam("passwd") String userPw, Model model) {
        model.addAttribute("data1", "@RequestParam 연습");
        model.addAttribute("data2", "요청 파라미터에 전달된 id값:" + userId
                + "<br>요청 파라미터에 전달된 pwd값:" + userPw);
        return "viewPage";
    }
}
