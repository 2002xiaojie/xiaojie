package edu.soft1.designModel;

public class SingleHungry {
    private static SingleHungry instance = new SingleHungry();
    private SingleHungry(){
        System.out.println("实例化一个新的饿汉单例");
    }
    public static SingleHungry getInstance(){
        return instance;
    }

}
