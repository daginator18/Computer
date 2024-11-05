package computer;

import java.util.ArrayList;
import java.util.List;
import computer.operand.word.*;
import computer.operand.*;

public class Memory {
    
    private WordFactory wf;
    private int size;
    private List<String> wfList;


    public Memory(int size, WordFactory wf){
        this.wf = wf;
        this.size = size;
        wfList = new ArrayList<>(size);
        for (int i = 0; i < size; i ++) {
            wfList.add("");
        }
    }

    public Word get(Address address) {
        return wf.word(wfList.get(address.value()));
    }

    public void set(Address address, Word word) {
        wfList.set(address.value(), word.toString());
    }
}
