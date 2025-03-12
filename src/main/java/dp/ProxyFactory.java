package dp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

    private static TrainStation trainStation = new TrainStation();

    public Service createProxy() {

        //返回了一个代理对象。代理的内容是火车站。添加的服务有一些人性化服务。
        return (Service) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(), trainStation.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK动态代理post，黄牛给你饮料零食");
                    //此处若使用代理类的sell，即代理方法。易造成死循环。
                    Object result = method.invoke(trainStation, args);
                    System.out.println("JDK动态代理after,黄牛欢送你");
                    return result;
                }

        );

        //通过arthas 工具从内存拿到这个类看到是 invocationhandler执行的。这个我们用匿名内部类，或则lamda表达式写的类，最终保存在父类Proxy中。
        //  return (String)this.h.invoke(this, m3, new Object[]{string, n});
    }
}
