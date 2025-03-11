package shop;

public class TV extends Product {

    private String resolution;

    public TV(String pName, int price, String resolution) {
        super(pName, price);
        this.resolution = resolution;
        // TODO Auto-generated constructor stub
    }

    @Override
    public void printExtra() {
        System.out.println("\t해상도 : " + this.resolution);
    }

}
