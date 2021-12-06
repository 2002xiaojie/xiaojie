package edu.soft1.pojo;

import lombok.Data;

@Data
public class CoffeeMachine {
    private CoffeeBean bean;
    public void makeCoffee(){
        System.out.println("咖啡机制作"+bean.getFlavor()+"口味的咖啡");
    }
}
