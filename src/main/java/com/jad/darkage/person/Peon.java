package com.jad.darkage.person;

public class Peon extends Person {
    public Peon(final String name, final String father, final int age) {
        super(name);
        this.age = age;
        this.father = father;
    }

    public int getAge() {
        return this.age;
    }

    private int age;
    private String father;
}
