package Decorator;

/**
 * 鸡蛋
 */
public class ConcreteComponent extends Component {


    @Override
    int cost() {
        return price();
    }

    @Override
    String des() {
        return "炒饭";
    }

    @Override
    int price() {
        return 10;
    }
}
