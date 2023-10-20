package components;
import java.util.List;

public class XOR extends AGate{
    public XOR(List<Boolean> inputs) {
        super(inputs);
        this.state = true;
        int trueCount = 0;
        for (Boolean input : inputs) {
            if (input) {
                trueCount++;
            }
        }
        //State is false when there are an even number of true inputs
        if (trueCount % 2 == 0) {
            this.state = false;
        }
    }
}
