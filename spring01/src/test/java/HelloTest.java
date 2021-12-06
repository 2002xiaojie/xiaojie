import edu.soft1.service.impl.HelloServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    @Test
    public void helloTest(){
        HelloServiceImpl helloService = (HelloServiceImpl) context.getBean("helloServiceImpl");
        helloService.sayHello();//切点
        helloService.sayHi();//非切点
    }
}
