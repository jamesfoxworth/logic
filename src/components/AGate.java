package components;
import java.util.List;
public class AGate {
    Boolean state;
    List<Boolean> inputs;

    public AGate(List<Boolean> inputs) {
        this.state = false;
        this.inputs = inputs;
    }

    public Boolean getState() {
        return this.state;
    }

    public void setInputs(List<Boolean> inputs) {
        this.inputs = inputs;
    }
    public void flip() {
        this.state = !this.state;
    }
    public String toString() {
        return this.state.toString();
    }
}
