package com.springinaction.spingidol;

public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {
    }


    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformerException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}
