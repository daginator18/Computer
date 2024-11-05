package computer.operand.word;

public class ByteWord extends Word {
    private byte value;

    public ByteWord(byte value) {
        this.value = value;
    }

    public Word add(Word w1, Word w2) {
        ByteWord b1 = (ByteWord) w1;
        ByteWord b2 = (ByteWord) w2;
        return new ByteWord((byte) (b1.value + b2.value));
    }

    public Word mul(Word w1, Word w2) {
        ByteWord b1 = (ByteWord) w1;
        ByteWord b2 = (ByteWord) w2;
        return new ByteWord((byte) (b1.value * b2.value));
    }

    public Boolean isEqual(Word word) {
        ByteWord b = (ByteWord) word;
        return this.value == b.value;
    }

    public String toString() {
        return Byte.toString(value);
    }
}
