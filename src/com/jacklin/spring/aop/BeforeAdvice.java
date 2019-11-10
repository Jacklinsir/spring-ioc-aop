package com.jacklin.spring.aop;

import java.lang.reflect.Method;

/**
 * @author laiqilin
 * @version 1.0
 * @date 2019/11/10 下午9:37
 * 实现Advice接口　实现前置通知
 */
public class BeforeAdvice implements Advice {


    private Object bean;

    private MethodInvocation methodInvocation;

    public BeforeAdvice(Object bean, MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }

    /**
     * Jｄｋ动态代理的实现
     *
     * @param proxy  生成代理对象
     * @param method 当前调用的真实方法
     * @param args   当前调用方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("日志操作");
        // 在目标方法执行前调用通知
        methodInvocation.invoke();
        System.out.println("权限操作");
        return method.invoke(bean, args);
    }
}
