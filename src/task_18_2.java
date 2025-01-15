class ArithmeticException extends IllegalArgumentException {
    public ArithmeticException(String message) {
        super(message);
    }
    public ArithmeticException(){
        super();
    }
}

class Frac {
    private int num;
    private int den;
    Frac(int n, int d) {
        if (d == 0) throw new ArithmeticException();
        if (n == 0) d = 1;
        int gcd = gcd(Math.abs(n), Math.abs(d));
        num = n / gcd;
        den = d / gcd;
        if (den < 0) {
            num = -num;
            den = -den;
        }
    }
    Frac(int n) {
        num = n;
        den = 1;
    }
    @Override
    public String toString(){
        if (den == 1) return Integer.toString(num);
        return num + "/" + den;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static Frac add(Frac a, Frac b) {
        int n = (a.num * b.den) + (a.den * b.num);
        int d = a.den * b.den;
        return new Frac(n, d);
    }

    public Frac add(Frac other){
        int n = (num * other.den) + (den * other.num);
        int d = den * other.den;
        return new Frac(n, d);
    }
    public static Frac sub(Frac a, Frac b) {
        int n = (a.num * b.den) - (a.den * b.num);
        int d = a.den * b.den;
        return new Frac(n, d);
    }

    public Frac sub(Frac other){
        int n = (num * other.den) - (den * other.num);
        int d = den * other.den;
        return new Frac(n, d);
    }
    public static Frac mul(Frac a, Frac b) {
        int n = a.num * b.num;
        int d = a.den * b.den;
        return new Frac(n, d);
    }

    public Frac mul(Frac other){
        int n = num * other.num;
        int d = den * other.den;
        return new Frac(n, d);
    }
    public static Frac div(Frac a, Frac b) {
        int n = a.num * b.den;
        int d = a.den * b.num;
        return new Frac(n, d);
    }

    public Frac div(Frac other){
        int n = num * other.den;
        int d = den * other.num;
        return new Frac(n, d);
    }
}

public class task_18_2 {
    public static void main(String[] args) {
        Frac a = new Frac(20, 4), b = new Frac(1, -2),
                c = new Frac(-14, -4), d = new Frac(-8, -4),
                f = new Frac(4), m = new Frac(-1);
        Frac f2 = Frac.add(Frac.mul(d, c),
                new Frac(10).mul(b));
        Frac f4 = Frac.add(Frac.mul(Frac.mul(a, b),
                new Frac(-2)), m);
        Frac zz = d.add(a).add(f.mul(Frac.mul(b, c)));
        Frac ww = Frac.div(f2, f4).sub(b).sub(c);
        System.out.println(f2 + " " + f4 + " " +
                zz + " " + ww);

    }
}
