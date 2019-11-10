package com.jacklin.spring.aop.test;

/**
 * @author laiqilin
 * @version 1.0
 * @date 2019/11/10 下午9:54
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("hello world!");
    }


}
