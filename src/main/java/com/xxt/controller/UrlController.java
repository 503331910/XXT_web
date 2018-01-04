package com.xxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 大哲哥 on 2017/12/21.
 */
@Controller
public class UrlController {
    //登录
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        return "app/login";
    }
    //欢迎页
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
    //主页
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
    //雪
    @RequestMapping(value = "/snow", method = RequestMethod.GET)
    public String snow() {
        return "snow";
    }
    //花
    @RequestMapping(value = "/flower", method = RequestMethod.GET)
    public String flower() {
        return "flower";
    }
    //照片墙
    @RequestMapping(value = "/photo_wall", method = RequestMethod.GET)
    public String photo_wall() {
        return "photo_wall";
    }
    //故事
    @RequestMapping(value = "/story", method = RequestMethod.GET)
    public String story() {
        return "story";
    }
//    ##################   app  #####################
    //登录
    @RequestMapping(value = "/app/login", method = RequestMethod.GET)
    public String app_login() {
        return "app/login";
    }
    //蛋糕
    @RequestMapping(value = "/app/make", method = RequestMethod.GET)
    public String app_make() {
        return "app/make";
    }
    //主页
    @RequestMapping(value = "/app/index", method = RequestMethod.GET)
    public String app_index() {
        return "app/index";
    }
}
