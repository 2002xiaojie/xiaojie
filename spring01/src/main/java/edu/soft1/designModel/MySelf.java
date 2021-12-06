package edu.soft1.designModel;

public class MySelf extends Object implements Cloneable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    protected MySelf clone() {
        MySelf me = null;
        try {
            me = (MySelf) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return me;
    }

}
