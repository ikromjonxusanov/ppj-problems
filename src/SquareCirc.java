import java.util.Locale;

class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public Circle getInscribedCircle() {
        return new Circle(side / 2);
    }

    public Circle getCircumscribedCircle() {
        return new Circle(side * Math.sqrt(2) / 2);
    }

    public static Circle[] getCircles(Square[] arr) {
        Circle[] circles = new Circle[arr.length];
        for (int i = 0; i < arr.length; i++) {
            circles[i] = new Circle(arr[i]);
        }
        return circles;
    }

    @Override
    public String toString() {
        return "Square(" + side + ")";
    }

}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Square square) {
        this.radius = Math.sqrt(square.getArea() / Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Square getInscribedSquare() {
        return new Square(radius * Math.sqrt(2));
    }

    public Square getCircumscribedSquare() {
        return new Square(2 * radius);
    }

//    public static Square[] getSquares(Circle[] arr) {
//        Square[] squares = new Square[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            squares[i] = new Square(arr[i].get);
//        }
//        return squares;
//    }

    @Override
    public String toString() {
        return "Circle(" + radius + ")";
    }
}

public class SquareCirc {
    public static void main(String[] args) {
        // we want doubles to be printed with a dot
        Locale.setDefault(Locale.US);

        Square[] sqs = {
                new Square(2), new Square(1), new Square(3)
        };

        System.out.print("Squares: ");
        for (Square s : sqs)
            System.out.print(s + " ");
        System.out.print("\nAreas: ");
        for (Square s : sqs)
            System.out.print(s.getArea() + " ");
        System.out.print("\nPerimeters: ");
        for (Square s : sqs)
            System.out.print(s.getPerimeter() + " ");
        System.out.print("\nInscribed circles: ");
        for (Square s : sqs)
            System.out.print(s.getInscribedCircle() + " ");
        System.out.print("\nCircumscribed circles: ");
        for (Square s : sqs)
            System.out.print(s.getCircumscribedCircle() + " ");

        System.out.println("\n\n...and now circles from squares...");
        Circle[] circles = Square.getCircles(sqs);
        System.out.print("Circles: ");
        for (Circle c : circles)
            System.out.print(c + " ");
        System.out.print("\nAreas: ");
        for (Circle c : circles)
            System.out.print(c.getArea() + " ");
        System.out.print("\nInscribed squares: ");
        for (Circle c : circles)
            System.out.print(c.getInscribedSquare() + " ");
        System.out.print("\nCircumscribed squares: ");
        for (Circle c : circles)
            System.out.print(c.getCircumscribedSquare() + " ");

//        System.out.println("\n\n...and back to squares...");
//        Square[] squares = Circle.getSquares(circles);
//        System.out.print("Squares: ");
//        for (Square s : squares)
//            System.out.print(s + " ");
//        System.out.println();
    }
}