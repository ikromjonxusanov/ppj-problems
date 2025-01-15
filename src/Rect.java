class Rect {
    Point ul;
    Point br;
    Rect(Point ul, Point br) {
        this.ul = ul;
        this.br = br;
    }
    static Rect getRect(Point ull, int w, int h) {
        return new Rect(new Point(ull.x, w), new Point(ull.y, h));
    }
    static Rect getContainingRect(Point[] arr) {
        return null;
    }
    void showInfo() {
    }
}