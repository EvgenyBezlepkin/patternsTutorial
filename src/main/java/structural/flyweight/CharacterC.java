package structural.flyweight;

public class CharacterC extends EnglishCharacter{

    public CharacterC() {
        symbol = 'C';
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
