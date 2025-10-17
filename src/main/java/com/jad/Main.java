package com.jad;

import com.jad.darkage.god.God;
import com.jad.darkage.person.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Noble jad = new Noble("JAD Ier The Mighty", 10000, Title.KING);
        jad.addLand("Marsas");
        jad.addLand("Cavignac");
        jad.addLand("Cézac");
        Priest hugo = new Priest("Père Hugo", 1500);
        Peon jacques = new Peon("Jacques", "Jacques", 36);
        Peon jacquette = new Peon("Jacquette", "Jacqueline", 20);
        Person emma = new Witch("Hemma");
        Person lucas = new NoblePoppers("Fernandez");
        persons.add(emma);
        persons.add(jad);
        persons.add(hugo);
        persons.add(jacques);
        persons.add(jacquette);
        persons.add(lucas);

        God god = new God();
        for (Person person : persons) {
            god.goDown(person);
        }
    }
}