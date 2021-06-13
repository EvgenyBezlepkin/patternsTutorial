package structural.bridge.shape;

import org.springframework.lang.NonNull;
import structural.bridge.draw.Draw;

import java.util.Objects;

public class Circle extends Shape {

    private final Point p;
    private final int radius;

    public Circle(Point p, int radius) {
        this.p = p;
        this.radius = radius;
    }

    public Circle(Point p, int radius, @NonNull Draw d) {
        this.p = p;
        this.radius = radius;
        draw = Objects.requireNonNull(d);
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

}
