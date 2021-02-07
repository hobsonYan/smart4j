package chapter4.proxy.dyncmicAgent;

import chapter4.proxy.Hello;
import chapter4.proxy.HelloImpl;

/**
 * @author yan hongbo
 * @date 2021/2/7 10:48
 * @description 测试动态代理, 使用于有对应接口的类
 */
public class TestDynamicProxy {

    public static void main(String[] args) {
        Hello hello = new HelloImpl();

        DynamicProxy dynamicProxy = new DynamicProxy(hello);

        Hello helloProxy = dynamicProxy.getProxy();

        helloProxy.say("Jack");
    }
}
