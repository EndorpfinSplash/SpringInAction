package com.springinaction.spingidol;

import org.springframework.stereotype.Component;

@Component("saxofonchik")
public class Saxophone implements Instrument{

    @Override
    public void play() {
        System.out.println("TOOT TOOT TOOT!");
    }


}
