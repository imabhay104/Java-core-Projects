public class Point {
    private int x,y;
    Point()
    {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance()
    {
        /*
        To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:]
d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
Where √ represents square root.
        * */
        Point p1 = new Point(0,0);
        return getDistance(this,p1);
    }
    private double getDistance(Point p1, Point p2)
    {
        int xA,yA,xB,yB;
        xA=p1.getX();
        yA=p1.getY();
        xB=p2.getX();
        yB=p2.getY();
        return Math.sqrt((xB-xA) * (xB - xA) + (yB - yA) * (yB -yA));

    }
    public double distance(Point point)
    {
    return getDistance(this,point);
    }
    public double distance(int x ,int y)
    {
        return getDistance(this,new Point(x,y));
    }
}
