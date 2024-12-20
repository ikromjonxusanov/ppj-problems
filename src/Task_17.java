//class Patient {
//    protected String name;
//
//    public String name() {
//        return name;
//    }
//
//    public Patient(String name) {
//        this.name = name;
//    }
//
//    public String illness() {
//        throw new UnsupportedOperationException("no value");
//    }
//
//    public String treatment() {
//        throw new UnsupportedOperationException("no value");
//    }
//
//}
//
//class IllHead extends Patient {
//    public IllHead(String name) {
//        super(name);
//    }
//
//    @Override
//    public String illness() {
//        return "head";
//    }
//
//    @Override
//    public String treatment() {
//        return "aspirin";
//    }
//}
//
//class IllLeg extends Patient {
//    public IllLeg(String name) {
//        super(name);
//    }
//
//    @Override
//    public String illness() {
//        return "leg";
//    }
//
//    @Override
//    public String treatment() {
//        return "plaster";
//    }
//}
//
//class IllDyspepsia extends Patient {
//    public IllDyspepsia(String name) {
//        super(name);
//    }
//
//    @Override
//    public String illness() {
//        return "dyspepsia";
//    }
//
//    @Override
//    public String treatment() {
//        return "coal";
//    }
//}
//

import java.util.Arrays;

class Vehicle {
    protected String name;
    protected int price;
    protected double mpg;

    public Vehicle(String n, int p, double f) {
        name = n;
        price = p;
        mpg = f;
    }

    @Override
    public String toString() {
        return "Vehicle " + name + "($" + price + "; fc=" + mpg + ")";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getMpg() {
        return mpg;
    }

    public int compareTo(Vehicle v) {
        if (this instanceof Bicycle && v instanceof Bicycle)
            return Integer.compare(getPrice(), v.getPrice());
        else if (this instanceof Bicycle && v instanceof Car)
            return -1;
        else if (this instanceof Car && v instanceof Bicycle)
            return 1;
        return Double.compare(getMpg(), v.getMpg()) * -1;

    }

    public static void sort(Vehicle[] vs) {
        for (int i = 0; i < vs.length-1; i++) {
            int index = i;
            for (int j = i+1; j < vs.length; j++)
                if (vs[j].compareTo(vs[index]) < 0) index = j;
            Vehicle temp = vs[index];
            vs[index] = vs[i];
            vs[i] = temp;
        }
    }
}

class Car extends Vehicle {
    public Car(String n, int p, double f) {
        super(n, p, f);
    }

    @Override
    public String toString() {
        return "Car " + getName() + "($" + getPrice() + "$; fc=" + getMpg() + ")";
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String n, int p) {
        super(n, p, 0);
    }

    @Override
    public String toString() {
        return "Bicycle " + getName() + "($" + getPrice() + ")";
    }

    @Override
    public double getMpg() {
        throw new UnsupportedOperationException();
    }
}

public class Task_17 {
    public static void main(String[] args) {
//        Patient[] patients = {
//                new IllHead("Johny"),
//                new IllLeg("Eddy"),
//                new IllDyspepsia("Manny")
//        };
//        for (Patient p : patients) {
//            System.out.println("Patient: " +
//                    p.name() + '\n' + "Illness: " +
//                    p.illness() + '\n' + "Treatment: " +
//                    p.treatment() + "\n\n"
//            );
//        }
        Vehicle[] vs = {
                new Car("Toyota", 25000, 50.5),
                new Bicycle("Pinarello", 1800),
                new Car("Ford", 21000, 55.1),
                new Bicycle("Canyon", 1600)
        };
        System.out.println(vs[1].compareTo(vs[3]));
        Vehicle.sort(vs);
        System.out.println(Arrays.toString(vs)
                .replaceAll(", ", "\n "));
    }
}
