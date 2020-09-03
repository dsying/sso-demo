package kode.mamba.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author shengding
 * @Date 2020/8/31 22:47
 * @Description
 */
@Controller
@RequestMapping("/sso")
public class SSOController {

    @GetMapping("/hello")
    @ResponseBody
    public Object hello() {
        return "hello world~";
    }
}
