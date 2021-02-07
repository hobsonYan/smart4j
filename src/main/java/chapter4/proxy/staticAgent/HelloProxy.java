package chapter4.proxy.staticAgent;

import chapter4.proxy.Hello;
import chapter4.proxy.HelloImpl;

/**
 * @author yan hongbo
 * @date 2021/2/7 10:35
 * @description hello 静态代理类
 */
public class HelloProxy implements Hello {

    private Hello hello;

    public HelloProxy() {
        hello = new HelloImpl();
    }


    @Override
    public void say(String name) {
        before();
        hello.say(name);
        after();
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}
