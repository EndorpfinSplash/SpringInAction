package com.springinaction.spingidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) throws PerformerException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
//        SpringHello hello = (SpringHello)context.getBean("sp");
//        hello.print();

        Performer performer = (Performer) context.getBean("kenny");
        performer.perform();
    }

}
