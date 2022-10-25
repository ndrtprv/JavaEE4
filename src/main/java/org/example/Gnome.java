package org.example;

public class Gnome extends CharacterRace{
    public Gnome() {
        setName("Gnome");
        setBonuses(new Stats(0, 1, 0, 2, 0, 0));
    }

    @Override
    public void saySMTH() {
        System.out.println("Forest");
    }
}