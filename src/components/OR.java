package components;
import java.util.List;

public class OR extends AGate{
    public OR(List<Boolean> inputs) {
        super(inputs);
        for (Boolean input : inputs) {
            if (input) {
                this.state = true;
                break;
            }
        }
    }
}
