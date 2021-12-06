import edu.soft1.ioc.printing.Printer;
import edu.soft1.pojo.CoffeeMachine;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    @Test
    public void getCoffee(){
        CoffeeMachine machine = (CoffeeMachine) context .getBean("coffeeMachine");
        machine.makeCoffee();
    }


@Test
    public void getPrinting(){
    Printer printer = (Printer) context.getBean("printer");
    printer.print();
}
}
