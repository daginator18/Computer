package computer.instruction;
import computer.Memory;

public class Jump implements Instruction {

    private int n;

    public Jump(int n) {
        this.n = n;
    }


    public void execute(Memory memory, PC pc) {
        pc.jump(n);
    }

    public String toString() {
        return String.format("Jump to %d", n);
    }
}