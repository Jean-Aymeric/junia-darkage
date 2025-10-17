package com.jad.darkage.person;

import com.jad.darkage.god.God;

public abstract class Person {
    private final String name;

    public Person(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void hearVoices(God god);
}
