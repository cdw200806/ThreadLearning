package Decorator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public abstract class Decorator extends Component {

    @Getter
    @Setter
    private Component component;
    @Getter
    @Setter
    private String des;
    @Getter
    @Setter
    private int price;

    Decorator(Component component, String des, int price) {
        this.component = component;
        this.des = des;
        this.price = price;
    }

    int cost() {
        return getComponent().cost() + getPrice();
    }

    String des() {
        return getDes() + getComponent().des();
    }

    int price() {
        return getPrice();
    }

}
