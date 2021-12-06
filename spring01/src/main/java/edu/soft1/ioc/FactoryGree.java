package edu.soft1.ioc;

public class FactoryGree implements Factory{
    @Override
    public Product make() {
        System.out.println("Gree工厂生产");
        return new ProductGree();
    }

}
