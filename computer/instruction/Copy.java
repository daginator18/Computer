package computer.instruction;

import computer.Memory;
import computer.operand.*;
import computer.operand.word.Word;

public class Copy implements Instruction {

    private Word word;
    private Address address;

    public Copy(Word word, Address address) {
        this.word = word;
        this.address = address;
    }

    public void execute(Memory memory, PC pc) {
        memory.set(address, word);
        pc.inc();
    }

    public String toString() {
        return String.format("Copy %s to %s", word, address);
    }
}