package structural.flyweight;

public class CharacterB extends EnglishCharacter{

    public CharacterB() {
        symbol = 'B';
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
