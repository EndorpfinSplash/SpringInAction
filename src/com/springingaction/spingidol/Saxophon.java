package com.springingaction.spingidol;

import org.springframework.stereotype.Component;

@Component
public class Saxophon implements Instrument{

    @Override
    public void play() {
        System.out.println("Saxophone phadypipa!");
    }
}
