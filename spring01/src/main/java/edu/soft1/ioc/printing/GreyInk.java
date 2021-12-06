package edu.soft1.ioc.printing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//功能类
@Component("greyInk")
public class GreyInk extends Ink{
    @Override
    @Value("【灰色】")
    public void setColor(String color) {
        super.setColor(color);
    }
}
