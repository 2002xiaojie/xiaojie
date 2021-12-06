package edu.soft1.service.impl;

import edu.soft1.service.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {System.out.println("hello,这里是sayHello");}
    public void sayHi() {System.out.println("Hi,这里是sayHi");}
}
