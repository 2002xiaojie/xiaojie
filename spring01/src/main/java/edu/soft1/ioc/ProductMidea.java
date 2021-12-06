package edu.soft1.ioc;

public class ProductMidea implements Product{
    @Override
    public Product show() {
        System.out.println("工厂生产");
        return null;
    }
}
