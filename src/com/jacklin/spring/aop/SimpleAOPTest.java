package com.jacklin.spring.aop;

/**
 * @author laiqilin
 * @version 1.0
 * @date 2019/11/10 下午9:35
 *
 * １．定义一个包含切面逻辑的对象，这里假设叫 MethodInvocation
 * ２．定义一个 Advice 对象（实现了 InvocationHandler 接口），并将上面的 logMethodInvocation 和 目标对象传入
 * ３．将上面的 Adivce 对象和目标对象传给 JDK 动态代理方法，为目标对象生成代理
 */
public class SimpleAOPTest {
}
