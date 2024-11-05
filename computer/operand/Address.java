package computer.operand;
import computer.Memory;
import computer.operand.word.*;

public class Address implements Operand {
    private int address;

    public Address(int address) {
        this.address = address;
    }

    public Word get(Memory memory) {
        return memory.get(this);
    }

    public int value() {
        return this.address;
    }

    public String toString() {
        return String.format("[%d]", address);
    }
}
