package edu.soft1.ioc;

public class ProductGree implements Product{

    @Override
    public Product show() {
        System.out.println("生产出一台Gree空调产品");
        return null;
    }

}
