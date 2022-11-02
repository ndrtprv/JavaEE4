package org.example;

import org.example.CharacterCreator.Character;
import org.example.CharacterCreator.DnDClass.ClassFactory;
import org.example.CharacterCreator.DnDRace.GnomeFactory;
import org.example.CharacterCreator.DnDRace.Half_OrcFactory;
import org.example.CharacterCreator.DnDRace.RaceAbstractFactory;
import org.example.DataVisitor.ElementVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ElementVisitor elementVisitor = new ElementVisitor();

        ClassFactory classFactory = new ClassFactory();

        RaceAbstractFactory raceAbstractFactory1 = new GnomeFactory();
        RaceAbstractFactory raceAbstractFactory2 = new Half_OrcFactory();

        Character character1 = new Character("Zaluzhnyi", classFactory.getClass("Fighter"), raceAbstractFactory1.create());
        character1.addRaceBonuses();
        character1.addBonus();
        character1.printSheet();
        character1.talk();
        System.out.println();

        Character character2 = new Character("Povoroznyuk", classFactory.getClass("Bard"), raceAbstractFactory2.create());
        character2.addRaceBonuses();
        character2.addBonus();
        character2.printSheet();
        character2.talk();
        System.out.println();

        System.out.println("Using Visitor:");
        elementVisitor.visit(character1);
        elementVisitor.visit(character1.getAttributes());
        elementVisitor.visit(character1.getDndClass());
        elementVisitor.visit(character1.getRace());
        System.out.println();

        elementVisitor.visit(character2);
        elementVisitor.visit(character2.getAttributes());
        elementVisitor.visit(character2.getDndClass());
        elementVisitor.visit(character2.getRace());
    }
}