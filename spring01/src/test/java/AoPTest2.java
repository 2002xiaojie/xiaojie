import edu.soft1.pojo.User;
import edu.soft1.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AoPTest2 {
    @Test
    public void testAop(){
    String name = "peter";
    String pwd = "123";
    String email = "peter@test.com";
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserServiceImpl service = (UserServiceImpl) context.getBean(UserServiceImpl.class);
        User user = (User) context.getBean(User.class);
        user.setUsername(name);user.setPassword(pwd);user.setEmail(email);
        service.add(user);
        service.delete(user);
        service.query(user);
        service.update(user);
    }

}
