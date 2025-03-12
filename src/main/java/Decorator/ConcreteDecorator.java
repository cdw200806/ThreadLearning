package Decorator;

/**
 * 鸡蛋
 */
public class ConcreteDecorator extends Decorator {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        System.out.println(component.des() + component.cost());

        component = new ConcreteDecorator(component);
        System.out.println(component.des() + component.cost());

        component = new ConcreteDecorator2(component);
        System.out.println(component.des() + component.cost());

        component = new ConcreteDecorator2(component);
        System.out.println(component.des() + component.cost());

        component = new ConcreteDecorator(component);
        System.out.println(component.des() + component.cost());

    }

    ConcreteDecorator(Component component) {
        super(component, "鸡蛋", 1);
    }

    @Override
    int cost() {
        return getComponent().cost() + price();
    }

}
