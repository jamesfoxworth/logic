package components;
import java.util.List;

public class NOT extends AGate {
    public NOT(List<Boolean> inputs) {
        super(inputs);
        this.state = !this.state;

    }
}
