package com.storet.controller.portal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/")
public class UserController {

        /**
         * 用户登陆
         */
        @RequestMapping(value = "login.do", method = RequestMethod.POST)
        @ResponseBody
        public Object login(String userName, String password, HttpSession session) {

                return null;
        }
}
