package edu.soft1.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        //1.得到Spring对象的Context的实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        //2.使用Context对象中的getBean(),获取到对象
        CoffeeBean bean = (CoffeeBean) applicationContext.getBean("CoffeeBean");//xml配置文件中id属性值
        //3.调用bean对象的方法
        /*bean.setFlavor("摩卡");*/
        bean.print();
    }
}
