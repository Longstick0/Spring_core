package TIre;

public class Driver {
    public static void main(String[] args) {
        Tire tire = new KoreanTire();
        // Tire tire = new AmericaTire();
        Car car = new Car(tire);
        System.out.println("car.getTireBrand");
    }
}
