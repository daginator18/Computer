package computer.operand.word;

public class LongWord extends Word {

    private long value;

    public LongWord(long value) {
        this.value = value;
    }

    public Word add(Word w1, Word w2) {
        LongWord l1 = (LongWord) w1;
        LongWord l2 = (LongWord) w2;
        return new LongWord(l1.value + l2.value);
    }

    public Word mul(Word w1, Word w2) {
        LongWord l1 = (LongWord) w1;
        LongWord l2 = (LongWord) w2;
        return new LongWord(l1.value * l2.value);
    }

    public Boolean isEqual(Word word) {
        LongWord l = (LongWord) word;
        return this.value == l.value;
    }

    public String toString() {
        return Long.toString(value);
    }
}
