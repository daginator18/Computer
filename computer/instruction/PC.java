package computer.instruction;

public class PC {
    
    private int pc;

    public PC () {
        this.pc = 0;
    }

    public void jump(int n) {
        pc = n;
    }

    public void inc() {
        pc ++;
    }

    public int get() {
        return this.pc;
    }

    public void end() {
        this.pc = -1;
    }
}
