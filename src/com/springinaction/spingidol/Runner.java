package com.springinaction.spingidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) throws PerformerException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
//        SpringHello hello = (SpringHello)context.getBean("sp");
//        hello.print();

/*        Performer performer = (Performer) context.getBean("kenny");
        performer.perform();*/

//        Instrumentalist performer2 = (Instrumentalist) context.getBean("kennyInner");
//        System.out.println(performer2.getInstrument());
//
//        Piano piano = (Piano) context.getBean("instrument");
//        System.out.println(piano);
//
//        System.out.println(((Instrumentalist) performer).instrument);

//        System.out.println("----autowiere by name ----");
//        Performer performerKenny2 = (Performer) context.getBean("kenny2");
//        performerKenny2.perform();

        Performer performerKennyAw = (Performer) context.getBean("kennyAutowired");
        performerKennyAw.perform();

//        System.out.println("----autowiere by type ----");
//        Performer performerKenny3 = (Performer) context.getBean("kenny_bean_autowired_by_type");
//        performerKenny3.perform();




    }

}
