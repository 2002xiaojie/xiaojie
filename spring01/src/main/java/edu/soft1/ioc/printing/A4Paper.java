package edu.soft1.ioc.printing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//功能类
@Component("a4Paper")
public class A4Paper extends Paper{
    @Override
    @Value("A4规格")
    public void setSize(String size) {
        super.setSize(size);
    }
}
