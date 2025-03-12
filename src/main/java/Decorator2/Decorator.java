package Decorator2;

import lombok.*;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Decorator {

    private Decorator component;

    private String des = "";

    private int price;

    int cost() {

        if (Objects.isNull(component)) {
            return getPrice();
        }

        return getComponent().cost() + getPrice();
    }

    String des() {
        if (Objects.isNull(component)) {
            return getDes();
        }
        return getDes() + getComponent().des();
    }

    int price() {
        return getPrice();
    }


}
