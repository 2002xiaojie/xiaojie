package edu.soft1.designModel;


/**
 * 懒汉模式
 */
public class SingleLazy {
    //静态对象
    private static SingleLazy instance;
    //私有构造方法
    private SingleLazy(){
        System.out.println("实列化一个新的懒汉单列~");


    }
    //共有且静态的方法（返回实列）
    public static synchronized SingleLazy getInstance(){
        if (instance == null){
            instance = new SingleLazy();

        }
        return instance;
    }
}
