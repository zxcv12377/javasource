package shop;

public class CellPhone extends Product {

    private String carrier;

    public CellPhone(String pName, int price, String carrier) {
        super(pName, price);
        this.carrier = carrier;
    }

    @Override
    public void printExtra() {
        System.out.println("\t통신사 : " + this.carrier);
    }

}
