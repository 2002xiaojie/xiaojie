package edu.soft1.ioc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {

    static Properties properties = new Properties();

    static {
        InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("iocBean.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //提供获取bean的类名的方法getBean()
    public static Object getBean(String beanName){
        String beanClass = properties.getProperty(beanName);
        System.out.println(beanClass);
        //装配为bean对象，用反射机制
        try {
          Object bean = Class.forName(beanClass).newInstance();
          return bean;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        /*反射，在运行时*/
        return null;
    }

    public static void main(String[] args) {
        getBean("product-gree");
    }

}
