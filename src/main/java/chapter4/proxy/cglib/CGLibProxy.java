package chapter4.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yan hongbo
 * @date 2021/2/7 10:57
 * @description CGLib动态代理类
 */
public class CGLibProxy implements MethodInterceptor {

    private static CGLibProxy instance = new CGLibProxy();

    private CGLibProxy() {
    }

    public static CGLibProxy getInstance() {
        return instance;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}
