package chapter4.proxy.staticAgent;

import chapter4.proxy.Hello;

/**
 * @author yan hongbo
 * @date 2021/2/7 10:39
 * @description 测试 hello 静态代理类
 */
public class TestHelloProxy {

    public static void main(String[] args) {
        Hello helloProxy = new HelloProxy();
        helloProxy.say("Jack");
    }
}
