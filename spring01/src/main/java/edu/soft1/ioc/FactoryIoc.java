package edu.soft1.ioc;

public class FactoryIoc {
    public static Product getBen(String productName){
        Product product = null;
       /* if (product.equals("Midea")){
            product = new ProductMidea();//注入
        }else if (product.equals("Gree")){
            product = new ProductGree();//注入
        }*/
        try {
            product = (Product) Class.forName(productName).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return product;
    }
}
