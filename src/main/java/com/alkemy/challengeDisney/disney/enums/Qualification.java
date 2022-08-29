package com.alkemy.challengeDisney.disney.enums;


public enum Qualification {
    uno("1"),
    dos("2"),
    tres("3"),
    cuatro("4"),
    cinco("5");

    private final String name;

    private Qualification(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
