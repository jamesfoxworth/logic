package components;
import java.util.List;

public class NOR extends AGate{
    public NOR(List<Boolean> inputs) {
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
