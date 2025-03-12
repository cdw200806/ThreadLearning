package Decorator;

/**
 * 鸡蛋
 */
public class ConcreteDecorator2 extends Decorator {

    ConcreteDecorator2(Component component) {
        super(component, "培根", 2);
    }

    @Override
    int cost() {
        return getComponent().cost() + price();
    }

}
