package com.jacklin.spring.aop.test;

import com.jacklin.spring.aop.Advice;
import com.jacklin.spring.aop.BeforeAdvice;
import com.jacklin.spring.aop.SimpleAOP;

/**
 * @author laiqilin
 * @version 1.0
 * @date 2019/11/10 下午9:55
 */
public class ApplicationTest {

    public static void main(String[] args) {
        //创建一个　MethodInvocation实现类


        HelloServiceImpl helloServiceImpl = new HelloServiceImpl();

        // 2. 创建一个 Advice
        Advice beforeAdvice = new BeforeAdvice(helloServiceImpl, ()->{});
        // 3. 为目标对象生成代理
        HelloService helloServiceImplProxy = (HelloService) SimpleAOP.getProxy(helloServiceImpl, beforeAdvice);
        System.out.println(helloServiceImplProxy.getClass());
        //在目标方法之前执行切面
        helloServiceImplProxy.sayHello();
    }
}
