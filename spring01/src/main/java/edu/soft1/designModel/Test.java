package edu.soft1.designModel;

public class Test {
/*    public static void main(String[] args) {
//        new Test();
        MySelf me = new MySelf();
        me.setName("peter");
        me.setAge(25);
        MySelf me1 = me.clone();
        MySelf me2 = me.clone();
        MySelf me3 = me.clone();
        System.out.println("me1="+me1);
        System.out.println("me2="+me2);
        System.out.println("me3="+me3);
    }*/
    /*public static void main(String[] args) {
        Singleton s = Singleton.getSingletongObj();
        s.setName("peter");
        s.setAge(24);
        System.out.println(s);
        System.out.println(Singleton.getSingletongObj());
        System.out.println(Singleton.getSingletongObj());

    }*/

    public static void main(String[] ages){
        int i = 0;
        while (i < 1000) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                SingleHungry single = SingleHungry.getInstance();
                    SingleLazy single = SingleLazy.getInstance();
                }
            }).start();
            i++;
        }
    }

}
