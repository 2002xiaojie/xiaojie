import edu.soft1.pojo.User;
import edu.soft1.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class AoPTest {
 int expected = 0;//预期结果值
 String name = null;//被测方法的参数
 String pwd =null;//被测方法的参数
 public AoPTest(int expected,String name, String pwd){
     this.expected = expected;this.name = name;this.pwd=pwd;}
    @Parameterized.Parameters//设置测试数据：预期结果，方法参数
    public static Collection<Object[]> t(){
     return Arrays.asList(new Object[][]{
             {1,"peter","123"},{1,"john","456"},{1,"steven","789"}});}
    @Test
    public void aopTest(){
     //用IoC的情况（减少new的使用，弱耦合结构）
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        UserServiceImpl service = (UserServiceImpl) context.getBean(UserServiceImpl.class);//?
        User user = (User) context.getBean(User.class);
        user.setUsername(name);
        user.setPassword(pwd);
        assertEquals(expected,service.add(user));//断言
    }

    private void assertEquals(int expected, int add) {
    }
}
