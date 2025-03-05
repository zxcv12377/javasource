package oop;

public class GoodsStock {
    String code;
    int stockNum;

    // public GoodsStock() {

    // }

    public GoodsStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    }

    void incStock(int stockNum) {
        this.stockNum += stockNum;
    }

    void decStock(int stockNum) {
        this.stockNum -= stockNum;
    }

    @Override
    public String toString() {
        return "GoodsStock [code=" + code + ", stockNum=" + stockNum + "]";
    }
}
