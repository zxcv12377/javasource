package oop;

import java.time.LocalDate;

public class ProductEx1 {
    public static void main(String[] args) {
        Product product1 = new Product("p10214", "운동화", 124000, null);

        product1.pCode = "p10214";
        product1.pName = "운동화";
        product1.price = 124000;
        product1.regiDate = LocalDate.now();

        System.out.println(product1);
    }
}
