package com.springingaction.spingidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Instrumentalist {

    @Autowired
    public Instrument instrument;

    private String song;

    void singsong() {
        System.out.println(song);
    }
}
