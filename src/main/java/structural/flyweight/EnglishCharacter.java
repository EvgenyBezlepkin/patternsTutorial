package structural.flyweight;

public abstract class EnglishCharacter {

    protected char symbol;
    protected final int width = 10;
    protected final int height = 20;

    public abstract String printCharacter();

}
