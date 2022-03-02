/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.order.model;

/**
 *
 * @author Quinga Leandro DEEE-ESPE
 */
public class Order {
    private Integer number1;
    private Integer number2;
    private Integer number3;
    private Integer number4;

    public Order(Integer number1, Integer number2, Integer number3, Integer number4) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
    }

    @Override
    public String toString() {
        return "Order{" + "number1=" + number1 + ", number2=" + number2 + ", number3=" + number3 + ", number4=" + number4 + '}';
    }

    
    public Integer getNumber1() {
        return number1;
    }

    public void setNumber1(Integer number1) {
        this.number1 = number1;
    }

    public Integer getNumber2() {
        return number2;
    }

    public void setNumber2(Integer number2) {
        this.number2 = number2;
    }

    public Integer getNumber3() {
        return number3;
    }

    public void setNumber3(Integer number3) {
        this.number3 = number3;
    }

    public Integer getNumber4() {
        return number4;
    }

    public void setNumber4(Integer number4) {
        this.number4 = number4;
    }
    
    
    
}
