package components;
import java.util.List;

public class NAND extends AGate {
    public NAND(List<Boolean> inputs) {
        super(inputs);
        this.state = true;
        for (Boolean input : inputs) {
            if (input) {
                this.state = false;
                break;
            }
        }
    }
}
