package org.example;

public class MementoPatternDemo {
    public static void main(String[] args) {
        RaceAbstractFactory raceAbstractFactory1 = new GnomeFactory();
        RaceAbstractFactory raceAbstractFactory2 = new Half_OrcFactory();

        Character character1 = new Character("Thorin", raceAbstractFactory1.create());
        character1.addRaceBonuses();
        character1.printSheet();
        character1.talk();
        System.out.println();

        Character character2 = new Character("Azog", raceAbstractFactory2.create());
        character2.addRaceBonuses();
        character2.printSheet();
        character2.talk();
    }
}