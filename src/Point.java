class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static Point getPoint(int x, int y) {
        return new Point(x, y);
    }
}