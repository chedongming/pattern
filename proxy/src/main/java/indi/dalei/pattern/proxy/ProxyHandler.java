package indi.dalei.pattern.proxy;

import java.lang.reflect.Method;

/**
 * Created by 刘大磊 on 2017/2/15 8:48.
 */
public class ProxyHandler {
    private Object proxied;

    public ProxyHandler( Object proxied )
    {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args ) throws Throwable
    {
        //在转调具体目标对象之前，可以执行一些功能处理

        //转调具体目标对象的方法
        return method.invoke( proxied, args);

        //在转调具体目标对象之后，可以执行一些功能处理
    }
}
