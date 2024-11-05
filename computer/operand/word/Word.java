package computer.operand.word;

import computer.operand.Operand;
import computer.Memory;
//




public abstract class Word implements Operand {    

    public abstract Word add(Word w1, Word w2);

    public abstract Word mul(Word w1, Word w2);

    public abstract Boolean isEqual(Word word);

    public abstract String toString();

    public Word get(Memory memory) {
        return this;
    }
}