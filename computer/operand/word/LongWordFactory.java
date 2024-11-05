package computer.operand.word;

import java.util.Optional;

public class LongWordFactory implements WordFactory {

    private Optional<Long> toLong(String value) {
        try {
            var nbr = Long.parseLong(value);
            return Optional.of(nbr);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public Word word(String value) {
        Optional<Long> nbr = toLong(value);
        if (nbr.isPresent()) {
            return new LongWord(nbr.get());
        } else {
            throw new NumberFormatException("Not eligible input");
        }
    }

    
}
