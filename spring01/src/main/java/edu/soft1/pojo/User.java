package edu.soft1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component//将bean对象装配到IoC容器中
public class User {
    private Integer id;//用户ID
    private String username;//用户名
    private String password;//密码
    private String email;//电子邮件

}
