package components;
import java.util.List;

public class AND extends AGate {
    public AND(List<Boolean> inputs) {
        super(inputs);
        this.state = true;
        for (Boolean input : inputs) {
            if (!input) {
                this.state = false;
                break;
            }
        }
    }
}
