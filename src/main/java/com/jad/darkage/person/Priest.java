package com.jad.darkage.person;

public class Priest extends Person {
    private final int money;

    public Priest(final String name, final int money) {
        super(name);
        this.money = money;
    }
}
