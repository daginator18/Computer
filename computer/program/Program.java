package computer.program;

import java.util.*;

import computer.Memory;
import computer.instruction.*;

public abstract class Program {

    private List<Instruction> instructions;
    private PC pc;

    public Program() {
        this.pc = new PC();
        instructions = new ArrayList<>();
    }

    protected void add(Instruction instruction) {
        instructions.add(instruction);
    }

    public void execute(Memory memory) {
        while (pc.get() > -1 ) {
            instructions.get(pc.get()).execute(memory, pc);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Instruction i : instructions) {
            sb.append(i.toString() + "\n");
        }
        return sb.toString();
    }
}