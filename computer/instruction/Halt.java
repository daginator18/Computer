package computer.instruction;
import computer.Memory;

public class Halt implements Instruction {
    
    public void execute(Memory memory, PC pc) {
        pc.end();
    }

    public String toString() {
        return "Halt";
    }
}