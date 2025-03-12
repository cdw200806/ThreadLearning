package Decorator2;

import lombok.NoArgsConstructor;

/**
 * 鸡蛋
 */
@NoArgsConstructor
public class ConcreteDecorator extends Decorator {
    public static void main(String[] args) {


        Decorator component = new ConcreteDecorator(new Decorator());
        System.out.println(component.des() + component.cost());

        component = new ConcreteDecorator2(component);
        System.out.println(component.des() + component.cost());

        component = new ConcreteDecorator2(component);
        System.out.println(component.des() + component.cost());

        component = new ConcreteDecorator(component);
        System.out.println(component.des() + component.cost());

    }

    ConcreteDecorator(Decorator component) {
        super(component, "鸡蛋", 1);
    }


}
