package com.springinaction.spingidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringIdolConfig {

    @Bean
    public Performer duke(){  /*Компонент получит идентификатор, совпадающий с именем метода. т.е bean id = "duke"*/
        return new PoeticJuggler(sonnet29());
    }

    @Bean
    public Poem sonnet29() {
        return new Sonet29();
    }

    @Bean
    public Performer kennedy() {
        Instrumentalist kennedy = new Instrumentalist();
        kennedy.setSong("Parrarerar");
        return kennedy;
    }
}
