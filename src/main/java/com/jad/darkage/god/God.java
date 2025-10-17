package com.jad.darkage.god;

import com.jad.darkage.person.*;

public class God {
    public void goDown(Person person) {
        person.hearVoices(this);
        // Affiche le nom de la personne rencontrée
        // si c'est un noble :
        //  affiche son titre, ses terres, son argent et le béni
        // si c'est un prêtre :
        //  affiche son argent et lui tapote sur l'épaule
        // si c'est un peon :
        // affiche fils de <nom du papa> c'est bien mon fils, continue de bosser
        // Contrainte son if, sans switch case et pas de typeof naturellement
    }

    public void reply(Noble noble) {
        System.out.println(noble.getName());
        System.out.println(noble.getTitre());
        System.out.println(noble.getLands().toString());
        System.out.println(noble.getMoney()+" écus");
        System.out.println("Bénis sois-tu, Noble.");
    }
    public void reply(NoblePoppers noblePoppers){
        System.out.println("Je veux pas te voir " + noblePoppers.getName());
    }

    public void reply(Peon peon) {
        System.out.println("Fils de " + peon.getFather() + "c'est bien mon fils, continue de bosser.");
        System.out.println("Bénis sois-tu, enfant de malheur.");
    }

    public void reply(final Priest priest) {
        System.out.println(priest.getName());
        System.out.println(priest.getMoney()+" écus");
        System.out.println("*tapote son épaule*");
    }
}
