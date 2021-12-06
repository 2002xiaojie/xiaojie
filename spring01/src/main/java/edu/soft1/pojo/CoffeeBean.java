package edu.soft1.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeBean {
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * 定义name属性，该属性的值将通过Spring框架进行设置
     */
    private String flavor;

    public void print(){
        System.out.println("喝" + this.getFlavor()+"口味的咖啡");
    }
}
