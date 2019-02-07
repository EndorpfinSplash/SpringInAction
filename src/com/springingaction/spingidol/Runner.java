package com.springingaction.spingidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        SpringHello hello = (SpringHello)context.getBean("sp");
        hello.print();

        Instrumentalist Kenny = (Instrumentalist) context.getBean("Kolya");
        Kenny.instrument.play();

        Instrumentalist Kenny2 = new Instrumentalist();
        Kenny2.instrument.play();
    }
}
