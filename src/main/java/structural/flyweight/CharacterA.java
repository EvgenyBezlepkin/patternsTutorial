package structural.flyweight;

public class CharacterA extends EnglishCharacter{

    public CharacterA() {
        symbol = 'A';
    }

    @Override
    public String printCharacter() {
        return "CharacterA{" +
                "symbol=" + symbol +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

}
