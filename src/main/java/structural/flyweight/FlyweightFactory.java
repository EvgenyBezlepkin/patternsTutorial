package structural.flyweight;

import java.util.EnumMap;


public class FlyweightFactory {

    private final EnumMap<Character, EnglishCharacter> characters = new EnumMap<>(Character.class);

    public EnglishCharacter getCharacter(Character characterCode){
        EnglishCharacter character = characters.get(characterCode);
        if (character == null){
            switch (characterCode){
                case A: {
                    character = new CharacterA();
                    break;
                }
                case B : {
                    character = new CharacterB();
                    break;
                }
                case C : {
                    character = new CharacterC();
                    break;
                }
            }
            characters.put(characterCode, character);
        }
        return character;
    }
}
