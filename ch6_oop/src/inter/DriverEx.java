package inter;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.drive(new Taxi());
        driver.drive(new Bus());
    }
}
