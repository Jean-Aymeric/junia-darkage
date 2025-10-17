package com.jad.darkage.person;

import com.jad.darkage.god.God;

import java.util.ArrayList;
import java.util.List;

public class NoblePoppers extends Noble {

    public NoblePoppers(final String name) {
        super(name, 0, null);
    }
    @Override
    public void hearVoices(final God god) {
        god.reply(this);
    }
}
