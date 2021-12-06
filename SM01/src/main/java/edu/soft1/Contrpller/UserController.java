package edu.soft1.Contrpller;

import edu.soft1.pojo.User;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.UUID;

@Controller

@RequestMapping(value = "/user")

public class UserController {
    @RequestMapping("/hello")
    public String hello(String username, Map<String, String> map) {
        System.out.println("---hello()---");//进入方法的标志
        //将传入的参数添加到Map对象(存入了request作用域)
        map.put("username", username);
        return "hello";
    }
    @RequestMapping(value = "upload",method = {RequestMethod.POST})
    public String fileUpload(MultipartFile image,HttpServletRequest request) throws IOException {
        System.out.println("abc");
        InputStream is = image.getInputStream();//输入流
        String filename = image.getOriginalFilename();//文件名称
        System.out.println("UserController.fileUpload");
        String realPath = request.getServletContext().getRealPath("/images");
        System.out.println("上传路径="+realPath);
        FileOutputStream os = new FileOutputStream(new File(realPath, doFileName(filename)));
        int size = IOUtils.copy(is, os);
        System.out.println("完成上传size" + size + "Byte");
        os.close();is.close();
        return "welcome";
    }

    private String doFileName(String filename) {
        String extension = FilenameUtils.getExtension(filename);//获取文件的后缀名称
        String uuid = UUID.randomUUID().toString();//或取uuid字符，规避名称重复
        System.out.println("上传文件名=" + uuid);
        return uuid + "." + extension;
    }



    @RequestMapping("/login")
    public String login(User user, HttpSession session, HttpServletRequest request) {
        System.out.println("---login()---");//进入控制器方法
        //获取user
        int flag = 1;//调用业务层
        if (flag == 1) {
            System.out.println("username" + user.getUsername());

            session.setAttribute("user", user);
            return "welcome";
        }
        System.out.println("登录失败，返回首页index");
        request.setAttribute("error", "用户名或密码不正确");
        return "forward:/index.jsp";//forward跳转至：/index。jsp
    }

    @RequestMapping("/delete")//被拦截器（Intereptor）拦截的方法
    public String delete(HttpServletRequest request) {
        System.out.println("-----执行delete()成功-----");
        request.setAttribute("CRUmsg", "删除功能执行完毕");
        return "hello";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        System.out.println("---welcome()---");
        return "welcome";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
        /*清空session*/
        session.invalidate();
        System.out.println("已登出~");
        return "redirect:/index.jsp";/*重定向跳转至首页*/
    }


}
      /*  System.out.println("username="+user.getUsername());
        System.out.println("age="+user.getAge());
        System.out.println("birthday="+user.getBirthday());
        System.out.println("city="+user.getAddress().getCity());
        System.out.println("street="+user.getAddress().getStreet());
        System.out.println("phone="+user.getAddress().getPhone());
        return "hello";
    }*/

