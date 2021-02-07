package chapter4.proxy;

/**
 * @author yan hongbo
 * @date 2021/2/7 10:34
 * @description
 */
public class HelloImpl implements Hello{

    @Override
    public void say(String name) {
        System.out.println("Hello! " + name);
    }
}
