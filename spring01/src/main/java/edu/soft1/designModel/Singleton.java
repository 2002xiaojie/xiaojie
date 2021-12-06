package edu.soft1.designModel;

public class Singleton {
    private String name;
    private int age;
    static Singleton instance;//静态化对象
    private Singleton(){//私有化的构造方法
        super();
    }

//返回唯一的实列
    public static Singleton getSingletongObj() {

        if (instance == null){

        }
        return instance;
    }

    public void setName(String peter) {
    }

    public void setAge(int i) {
    }
}
