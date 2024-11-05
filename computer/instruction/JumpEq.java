package computer.instruction;
import computer.Memory;
import computer.operand.*;

public class JumpEq implements Instruction {

    private int n;
    private Operand op1;
    private Operand op2;
    
    public JumpEq(int n, Operand op1, Operand op2) {
        this.n = n;
        this.op1 = op1;
        this.op2 = op2;
    }

    
    public void execute(Memory memory, PC pc) {
        if (op1.get(memory).isEqual(op2.get(memory))) {
            pc.jump(n);
        } else {
            pc.inc();
        }
        
    }

    public String toString() {
        return String.format("Jump to %s if %s == %s", n, op1, op2);
    }
}