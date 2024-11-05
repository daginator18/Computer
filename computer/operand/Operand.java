package computer.operand;
import computer.Memory;
//
import computer.operand.word.Word;

public interface Operand {
    Word get(Memory memory);
    String toString();
}
