package computer.instruction;
import computer.Memory;
import computer.operand.*;
import computer.operand.word.*;

public class Mul implements Instruction {
    
    private Operand op1;
    private Operand op2;
    private Address address;

    public Mul(Operand op1, Operand op2, Address address) {
        this.op1 = op1;
        this.op2 = op2;
        this.address = address;
    }

    public void execute(Memory memory, PC pc) {
        memory.set(address, op1.get(memory).mul(op1.get(memory), op2.get(memory)));
        pc.inc();
    }

    public String toString() {
        return String.format("Multiply %s and %s into %s", op1, op2, address);
    }
}
