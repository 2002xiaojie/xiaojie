package edu.soft1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
    @RequestMapping(path ="/hello.do")
    public String Hello(){
        /*前缀是   WEB-INF/JSP/*/
        /*后缀是。jsp*/
        System.out.println("---hello()---");
        return "index2";//转发到//WEB-INF/JSP/INDEX2.JSP
    }
}
