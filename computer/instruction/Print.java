package computer.instruction;
import computer.Memory;
import computer.operand.*;

public class Print implements Instruction {

    private Address address;

    public Print (Address address) {
        this.address = address;
    }

    public void execute(Memory memory, PC pc) {
        System.out.println(memory.get(address).toString());

        pc.inc();
    }

    public String toString() {
        return String.format("Print %s", address);
    }
}