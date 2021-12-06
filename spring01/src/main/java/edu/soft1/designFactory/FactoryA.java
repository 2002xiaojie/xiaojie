package edu.soft1.designFactory;

public  class FactoryA extends Factory{
    @Override
    public Product maunfacture() {
        System.out.println("A工厂");
        return new ProductX();
    }
}
