package com.jad.darkage.person;

import com.jad.darkage.god.God;

public class Peon extends Person {
    private int age;
    private String father;

    public Peon(final String name, final String father, final int age) {
        super(name);
        this.age = age;
        this.father = father;
    }

    public int getAge() {
        return this.age;
    }

    public String getFather() {
        return this.father;
    }

    @Override
    public void hearVoices(final God god) {
        god.reply(this);
    }
}
