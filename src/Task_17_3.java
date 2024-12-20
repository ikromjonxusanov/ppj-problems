class CalculatingDevice {
    protected String name;

    public CalculatingDevice(String name) {
        this.name = name;
    }
    public String calculate(double x, double y) {
        return x + "+" + y + "=" + (x+y)+";";
    }
    public static void printRes(CalculatingDevice[] a, double x, double y) {
        for (CalculatingDevice c: a) {
            System.out.println(c.name + ": " + c.calculate(x, y));
        }
    }
}

class Calculator extends CalculatingDevice {
    public Calculator(String name) {
        super(name);
    }
    @Override
    public String calculate(double x, double y) {
        return super.calculate(x, y) + " " + x + "-" + y + "=" + (x-y)+";";
    }

}
class Computer extends Calculator {
    public Computer(String name) {
        super(name);
    }
    @Override
    public String calculate(double x, double y) {
        return super.calculate(x, y) + " " + x + "*" + y + "=" + (x*y)+"; " + x + "/" + y + "=" + (x/y)+";";
    }

}

public class Task_17_3 {
    public static void main(String[] args) {
        CalculatingDevice[] arr = {
                new Computer("Cray"),
                new CalculatingDevice("Abacus"),
                new Calculator("HP")
        };
        CalculatingDevice.printRes(arr, 21, 7);
    }
}
