package com.lan.yidan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Gaol on 2018/6/2.
 */

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public @ResponseBody String index() {

        return  "Welcome to home!";
    }


}
