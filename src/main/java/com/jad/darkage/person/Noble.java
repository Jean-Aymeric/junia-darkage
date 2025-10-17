package com.jad.darkage.person;

import com.jad.darkage.god.God;

import java.util.ArrayList;
import java.util.List;

public class Noble extends Person {
    private final List<String> lands = new ArrayList<>();
    private final int money;
    private final Title titre;

    public Noble(final String name, final int money, final Title titre) {
        super(name);
        this.money = money;
        this.titre = titre;
    }

    public List<String> getLands() {
        return this.lands;
    }

    public int getMoney() {
        return this.money;
    }

    public Title getTitre() {
        return this.titre;
    }

    public void addLand(final String land) {
        this.lands.add(land);
    }

    @Override
    public void hearVoices(final God god) {
        god.reply(this);
    }
}
