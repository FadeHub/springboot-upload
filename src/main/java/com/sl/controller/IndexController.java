package com.sl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shuliangzhao
 * @Title: IndexController
 * @ProjectName springboot-upload
 * @Description: TODO
 * @date 2020/6/4 23:29
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
