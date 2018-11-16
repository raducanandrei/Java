package OOP;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car(fuel = 10f, fuelConsumption = 8f, started = false);


        Car dacia = new Car(fuel: 10f, fuelConsumption: 8f, started: false);


        bmw.start();
        bmw.drive(180);
        bmw.drive(600);


        System.out.println(bmw.getFuel());
        System.out.println(bmw.range());

        bmw.wheels = 3;
        System.out.println(bmw.wheels);
        System.out.println(dacia.wheels);




    }
}
