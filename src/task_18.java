import java.util.Random;
class NotEnoughGas extends IllegalArgumentException {
    public NotEnoughGas(int remain_fuel) {
        super("Only " + remain_fuel + "liters. Must fill the tank");
    }
}
class Explosion extends IllegalArgumentException {
    public Explosion() {
        super();
    }
}
class Car {
    private int fuel_amount;
    private int distance_driven;

    Car() {
        fuel_amount = 35;
        distance_driven = 0;
    }

    void fill() {
        Random r = new Random();
        if (r.nextInt(10) <= 1) throw new Explosion();
        fuel_amount += r.nextInt(21) + 15;
        System.err.println("After filling " + fuel_amount);
    }
    void drive100km() {
        if (fuel_amount < 10) throw new NotEnoughGas(fuel_amount);
        fuel_amount -= 10;
        distance_driven += 100;
        System.err.println(distance_driven + "km driven, " + fuel_amount + "liters left");
    }
}

public class task_18 {
    public static void main(String[] args) {
        Car car = new Car();
        while (true) {
            try {
                car.drive100km();
            } catch (NotEnoughGas e) {
                System.err.println(e.getMessage());
                car.fill();
            }
        }
    }
}
