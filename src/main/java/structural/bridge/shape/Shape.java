package structural.bridge.shape;

import structural.bridge.draw.Draw;
import structural.bridge.draw.DrawDefault;

public abstract class Shape {

    public Draw draw = new DrawDefault();

    public abstract double getArea();

    public void draw() {
        draw.draw();
    }

}
