class Temperature {
    double tm;
    char unit;

    Temperature(double tm, char unit) {
        this.tm = tm;
        this.unit = unit;
    }

    public double getInC() {
        if (unit == 'C') {
            return tm;
        } else if (unit == 'K') {
            return tm - 273.15;
        } else if (unit == 'F') {
            return 5./9*(tm - 32);
        }
        return 0;
    }

    public double getInF() {
        if (unit == 'C') {
            return 9./5*tm + 32;
        } else if (unit == 'K') {
            return 9./5*(tm - 273.15) + 32;
        } else if (unit == 'F') {
            return tm;
        }
        return 0;
    }

    public double getInK() {
        if (unit == 'C') {
            return tm + 273.15;
        } else if (unit == 'K') {
            return tm;
        } else if (unit == 'F') {
            return 5./9*(tm - 32) + 273.15;
        }
        return 0;
    }

}

public class Temperatures {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(25, 'C');
        System.out.printf("C: %6.2f%n", t1.getInC());
        System.out.printf("F: %6.2f%n", t1.getInF());
        System.out.printf("K: %6.2f%n", t1.getInK());
        Temperature t2 = new Temperature(77, 'F');
        System.out.printf("C: %6.2f%n", t2.getInC());
        System.out.printf("F: %6.2f%n", t2.getInF());
        System.out.printf("K: %6.2f%n", t2.getInK());
        Temperature t3 = new Temperature(298.15, 'K');
        System.out.printf("C: %6.2f%n", t3.getInC());
        System.out.printf("F: %6.2f%n", t3.getInF());
        System.out.printf("K: %6.2f%n", t3.getInK());
    }
}

