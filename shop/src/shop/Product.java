package shop;

public abstract class Product {
    private String pName;
    private int price;

    public Product(String pName, int price) {
        this.pName = pName;
        this.price = price;
    }

    public String getpName() {
        return pName;
    }

    public int getPrice() {
        return price;
    }

    public void printDetail() {
        System.out.println("\t제품명 : " + this.pName);
        System.out.println("\t가격 : " + this.price);
        printExtra();
    }

    public abstract void printExtra();
}
