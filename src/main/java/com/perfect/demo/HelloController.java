package com.perfect.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 说明：测试
 */
@RestController
public class HelloController {
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {

        return "Hello SpringBoot11";
    }
}
