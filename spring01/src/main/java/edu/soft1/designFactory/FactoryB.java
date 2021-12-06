package edu.soft1.designFactory;

public class FactoryB extends Factory{
    @Override
    public Product maunfacture() {
        System.out.println("B工厂");
        return new ProductY();
    }
}
