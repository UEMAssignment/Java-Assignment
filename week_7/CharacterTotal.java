public class CharacterTotal {
    private int total;

    public CharacterTotal() {
        total = 0;
    }

    public void addChar(char c) throws NonAlphabeticCharacterException {
        if (Character.isLetter(c)) {
            total++;
        } else {
            throw new NonAlphabeticCharacterException("Non-alphabetic character detected: " + c);
        }
    }

    public int getTotal() {
        return total;
    }
}

class NonAlphabeticCharacterException extends Exception {
    public NonAlphabeticCharacterException(String message) {
        super(message);
    }
}

