package com.springinaction.spingidol;

public class Stage {
//    singleton
    private Stage() {}

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageSingletonHolder.instance;
    }
}
