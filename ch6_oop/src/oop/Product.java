package oop;

import java.time.LocalDate;

public class Product {
    String pCode;
    String pName;
    int price;
    LocalDate regiDate;

    public void changePrice() {

    }

    @Override
    public String toString() {
        return "Product [pCode=" + pCode + ", pName=" + pName + ", Price=" + price + ", regiDate=" + regiDate + "]";
    }

}
