package creational.propotype;


public class ObjectField implements Cloneable{
    int a;

    public ObjectField(int a) {
        this.a = a;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectField that = (ObjectField) o;
        return a == that.a;
    }


}
