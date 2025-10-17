package com.jad.darkage.person;

import com.jad.darkage.god.God;

public class Priest extends Person {
    private final int money;

    public Priest(final String name, final int money) {
        super(name);
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    @Override
    public void hearVoices(final God god) {
        god.reply(this);
    }
}
