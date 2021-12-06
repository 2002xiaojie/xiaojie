package edu.soft1.ioc.printing;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 打印机
 */
@Component
public class Printer {
    private Ink ink;
    private Paper paper;
@Autowired
@Qualifier("colorInk")
    public void setInk(Ink ink) {this.ink = ink;

}

@Resource(name = "a4Paper")
    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(){
        System.out.println("打印"+ink.getColor()+"的"+paper.getSize()+"大小的纸张");
    }
}
