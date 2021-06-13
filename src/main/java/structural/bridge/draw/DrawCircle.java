package structural.bridge.draw;

import structural.bridge.shape.Shape;

public class DrawCircle implements Draw {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}
