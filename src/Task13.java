//class Square {
//    int x;
//
//    Square(int x) {
//        this.x = x;
//    }
//
//    Square() {
//        this.x = 1;
//    }
//
//    public double getSide() {
//        return x;
//    }
//
//    public double getArea() {
//        return x * x;
//    }
//
//    public double getDiagonal() {
//        return x * Math.sqrt(2);
//    }
//
//    public double getPerimeter() {
//        return 2 * x * x;
//    }
//
//    public Square getDoubled() {
//        return new Square(x * 2);
//    }
//
//    public String toString() {
//        return "Square [" + (double) (x) + "]";
//    }
//
//    public static double getTotalArea(Square[] sqs) {
//        double totalArea = 0;
//        for (Square sq : sqs) {
//            totalArea += sq.getArea();
//        }
//        return totalArea;
//    }
//
//    public static Square getMax(Square[] sqs) {
//        Square max = sqs[0];
//        for (int i = 1; i < sqs.length; i++) {
//            if (sqs[i].getSide() > max.getSide()) {
//                max = sqs[i];
//            }
//        }
//        return max;
//    }
//}



public class Task13 {
    public static void main(String[] args) {
//        Square s2 = new Square(2);
//        Square s1 = new Square();
//        System.out.println(s2 + " " + s1);
//        System.out.println("Side " + s2.getSide());
//        System.out.println("Area " + s2.getArea());
//        System.out.println("Diag " + s2.getDiagonal());
//        System.out.println("Perim " + s2.getPerimeter());
//        System.out.println("Doubled " + s2.getDoubled());
//        Square[] sqs = {s1, s2, new Square(3)};
//        System.out.println("Total area: " +
//                Square.getTotalArea(sqs));
//        System.out.println("Greatest : " +
//                Square.getMax(sqs));
        Rect rec = Rect.getRect(Point.getPoint(2, 6), 6, 4);
        rec.showInfo();
        Point[] points = {
                Point.getPoint(3, 4), Point.getPoint(5, 6),
                Point.getPoint(1, 3), Point.getPoint(5, 3),
                Point.getPoint(4, 1), Point.getPoint(3, 7)
        };
        Rect cont = Rect.getContainingRect(points);
        cont.showInfo();

    }
}
