package com.springinaction.spingidol;

public class Instrumentalist implements Performer{

    public Instrumentalist() {
    }

    @Override
    public void perform() throws PerformerException {
        System.out.println("Playing " + song + " : ");
        instrument.play();
    }

    private String song;
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
