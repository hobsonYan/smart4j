package chapter4.proxy.cglib;

import chapter4.proxy.Hello;
import chapter4.proxy.HelloImpl;

/**
 * @author yan hongbo
 * @date 2021/2/7 11:08
 * @description 测试 CGLib 动态代理类, 使用于无对应接口的类
 */
public class TestCGLibProxy {

    public static void main(String[] args) {

        Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
        helloProxy.say("Jack");
    }
}
