package org.example.CharacterCreator.DnDClass;

import java.util.*;

public class Bard extends CharacterClass {
    private final List<String> spells;

    public Bard() {
        setName("Bard");
        setHp(8);
        spells = new ArrayList<>();
        spells.addAll(List.of(new String[]{"Charm Person", "Heroism"}));
    }

    public List<String> getSpells() {
        return spells;
    }

    public void printMagika() {
        System.out.println("Spells: ");
        for (String s: spells) {
            System.out.println(s);
        }
    }

    /*@Override
    public void accept() {
        System.out.println("Class name: " + getName());
        System.out.println("Default HP: " + getHP());
        printMagika();
    }*/
}