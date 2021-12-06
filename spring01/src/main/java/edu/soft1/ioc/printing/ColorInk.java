package edu.soft1.ioc.printing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//功能类
@Component
public class ColorInk extends Ink{
    @Override
    @Value("【彩色】")
    public void setColor(String color) {
        super.setColor(color);
    }
}
