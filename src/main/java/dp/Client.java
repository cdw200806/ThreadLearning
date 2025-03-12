package dp;

public class Client {

    public static void main(String[] args) throws Exception {

        ProxyFactory proxyFactory = new ProxyFactory();
        Service service = proxyFactory.createProxy();

        System.out.println(service.sell("火车票", 22));
        System.out.println(service.query("火车票"));

        System.out.println(service.getClass());
        Thread.sleep(1000000);

    }
}
