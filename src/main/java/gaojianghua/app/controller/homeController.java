package gaojianghua.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello 你们好";
    }
}
