package cglibproxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private static TrainStation trainStation = new TrainStation();

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.createProxy().sell("火车票", 23);
    }

    public TrainStation createProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TrainStation.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("代理逻辑pre");
                // Object object = method.invoke(o, objects);

                //只有 methodProxy 能invokeSuper。如果是用目标对象的话两个都行。起码试着是这样
                Object object = methodProxy.invokeSuper(o, objects);
                System.out.println("代理逻辑after");
                return object;
            }
        });
        return (TrainStation) enhancer.create();
    }


}
