package com.jad.darkage.person;

import com.jad.darkage.god.God;

public class Witch extends Person{

    public Witch(final String name) {
        super(name);
    }

    @Override
    public void hearVoices(final God god) {
        System.out.println("Fuck j'ai pas envie de toi");
    }
}
