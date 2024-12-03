class Rect {
    Point ul;
    Point br;

    Rect(Point ul, Point br) {
        this.ul = ul;
        this.br = br;
    }

    static Rect getRect(Point ull, int w, int h) {
        return new Rect(ull, new Point(ull.x + w, ull.y - h));
    }

    static Rect getContainingRect(Point[] arr) {
        int minX = arr[0].x;
        int minY = arr[0].y;
        int maxX = arr[0].x;
        int maxY = arr[0].y;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].x < minX) {
                minX = arr[i].x;
            }
            if (arr[i].x > maxX){
                maxX = arr[i].x;
            }
            if (arr[i].y < minY) {
                minY = arr[i].y;
            }
            if (arr[i].y > maxY){
                maxY = arr[i].y;
            }
        }
        return new Rect(new Point(minX, maxY), new Point(maxX, minY));
    }

    void showInfo() {
        System.out.println("UL=(" + ul.x + ", " + ul.y + ") BR=(" + br.x + ", " + br.y + ")");
    }
}