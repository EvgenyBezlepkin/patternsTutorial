package structural.flyweight;

public enum Character {
    A(1),
    B(2),
    C(3);

    private int intMapping;

    Character(int intMapping) {
        this.intMapping = intMapping;
    }

    public int getIntMapping() {
        return intMapping;
    }
}
