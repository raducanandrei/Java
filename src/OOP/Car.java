package OOP;

public class Car {
    private float fuel;
    private float fuelConsumption;
    private boolean started;
    static int wheels = 4;

    public float getFuel() {
        return fuel;
    }

    public Car(float fuel, float fuelConsumption, boolean started) {
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.started = started;

    }

    public void start(){
        started = true;
    }
    public void drive(int distance) {
        fuel -= fuelConsumption * distance / 100;
        if (fuel < 0);{
            fuel = 0;



            }


        }

    public float range(){
        return fuel / fuelConsumption * 100;



    }
}
