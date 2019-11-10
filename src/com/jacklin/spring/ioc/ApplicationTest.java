package com.jacklin.spring.ioc;

import com.jacklin.spring.ioc.bean.Car;
import com.jacklin.spring.ioc.bean.Wheel;

/**
 * @author laiqilin
 * @version 1.0
 * @date 2019/11/10 下午10:26
 */
public class ApplicationTest {

    public static void main(String[] args) throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("spring-ioc.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
