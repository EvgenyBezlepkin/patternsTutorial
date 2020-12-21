package creational.propotype;

import java.util.Objects;

public abstract class Shape implements Cloneable{
    int x;
    int y;
    String color;
    ObjectField ex;

    public Shape() {
    }

    // клонируем объект и объектные поля
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Shape sh = ((Shape)super.clone());
        sh.ex = (ObjectField)sh.ex.clone();
        return sh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        if (x != shape.x) return false;
        if (y != shape.y) return false;
        if (!Objects.equals(color, shape.color)) return false;
        return Objects.equals(ex, shape.ex);
    }

}
