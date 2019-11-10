package com.jacklin.spring.aop;

import java.lang.reflect.Proxy;

/**
 * @author laiqilin
 * @version 1.0
 * @date 2019/11/10 下午9:48
 * // 生成代理类
 */
public class SimpleAOP {
    public static Object getProxy(Object bean, Advice advice) {
        /**
         * 参数1:类加载器定义代理类
         * 参数2:代理类要实现的接口
         * 参数3:代理接口
         */
        return Proxy.newProxyInstance(SimpleAOP.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}
