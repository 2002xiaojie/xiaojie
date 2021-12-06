package edu.soft1.ioc;

public class Test {
    public static void main(String[] args){
        //3.工厂方法模式+BeanFacory(反射)+properties属性文件
        Product product = (Product) BeanFactory.getBean("proproduct");
        product.show();
        //2.工厂模式
       /* Product product2 = FactoryIoc.getBen("");
        System.out.println(product2 instanceof ProductMidea);
        product2.show();*/
        //1.工厂方法模式
        /*Factory factory = new FactoryGree();
        Product product = factory.make();
        product.show();*/
    }
}
