package edu.soft1.designFactory;

public class Test {
    public static void main(String[] ages){
        Factory a = new FactoryA();
       Product p = a.maunfacture();
       p.show();
       new FactoryB().maunfacture().show();
    }
}
