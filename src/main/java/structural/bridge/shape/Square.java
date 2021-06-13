package structural.bridge.shape;

import structural.bridge.draw.Draw;

public class Square extends Shape{

    private final Point p1;
    private final Point p2;
    private final Point p3;
    private final int radius;

    public Square(Point p1, Point p2, Point p3, int radius) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.radius = radius;
    }

    public Square(Point p1, Point p2, Point p3, int radius, Draw d) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.radius = radius;
        draw = d;
    }

    @Override
    public double getArea() {
        double distance = p1.getDistance(p2);
        return distance * distance;
    }

    @Override
    public void draw() {

    }

}
