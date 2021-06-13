package structural.bridge.draw;

import structural.bridge.shape.Shape;

public class DrawDefault implements Draw {
    @Override
    public void draw() {
        System.out.println("draw me yourself");
    }
}
