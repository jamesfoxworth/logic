package components;
import java.util.List;

public class XNOR extends AGate{
    public XNOR(List<Boolean> inputs) {
        super(inputs);
        this.state = false;
        int trueCount = 0;
        for (Boolean input : inputs) {
            if (input) {
                trueCount++;
            }
        }
        //State is true when there are an even number of true inputs
        if (trueCount % 2 == 0) {
            this.state = true;
        }
    }
}
