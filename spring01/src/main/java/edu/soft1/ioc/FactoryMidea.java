package edu.soft1.ioc;

public class FactoryMidea implements Factory{

    public Product make(){
        System.out.println("Midea工厂生产");
        return new ProductMidea();
    }
}
