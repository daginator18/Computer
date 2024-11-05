package computer.instruction;
import computer.Memory;

public interface Instruction {

    void execute(Memory memory, PC pc);
    String toString();
}


