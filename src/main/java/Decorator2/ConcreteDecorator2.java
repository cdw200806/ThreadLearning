package Decorator2;

import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * 鸡蛋
 */
@NoArgsConstructor
public class ConcreteDecorator2 extends Decorator {

    ConcreteDecorator2(Decorator component) {
        super(component, "培根", 2);
    }


}
