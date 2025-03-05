package oop;

public class GoodsStockEx {
    public static void main(String[] args) {
        // GoodsStock goodsStock1 = new GoodsStock();
        GoodsStock goodsStock1 = new GoodsStock("p1013", 50);

        System.out.println(goodsStock1);
        goodsStock1.decStock(5);
        System.out.println(goodsStock1);

        goodsStock1.incStock(10);
        System.out.println(goodsStock1);
    }
}
