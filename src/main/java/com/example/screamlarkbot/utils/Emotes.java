package com.example.screamlarkbot.utils;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Emotes {
    FROG_WAVE("FrogWave"),
    LIZARD_PLS("lizardPls"),
    FEELS_WEAK_MAN("FeelsWeakMan"),
    PEEPO_CLAP("peepoClap"),
    OOOO("OOOO"),
    FIGHT("fight"),
    FIGHT2("fight2"),
    STREAML_SMASH("streamlSmash");

    private final String name;

    @Override
    public String toString() {
        return name;
    }
}
