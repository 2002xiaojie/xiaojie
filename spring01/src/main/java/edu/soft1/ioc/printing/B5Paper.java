package edu.soft1.ioc.printing;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

//
@Data
public class B5Paper extends Paper{
    @Override
    @Value("B5规格")
    public void setSize(String size) {
        super.setSize(size);
    }
}
