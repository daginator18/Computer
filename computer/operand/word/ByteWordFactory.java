package computer.operand.word;

import java.util.Optional;

public class ByteWordFactory implements WordFactory {
    
    private Optional<Byte> toByte(String value) {
        try {
            int val = Integer.parseInt(value);
            byte result = (byte) val;
            return Optional.of(result);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public Word word(String value) {
        Optional<Byte> nbr = toByte(value);
        if (nbr.isPresent()) {
            return new LongWord(nbr.get());
        } else {
            throw new NumberFormatException("bajs");
        }
    }

}
