public class Point {
    private int x;
    private int y;

    // Default constructor using constructor chaining
    public Point() {
//        Point p=new Point();
//        p.Point(0,0);
        this(0, 0); // Calls the parameterized constructor with (0,0)
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter methods
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    // Distance methods
    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point point) {
        return distance(point.x, point.y);
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
