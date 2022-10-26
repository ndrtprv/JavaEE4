package org.example;

import org.example.CharacterCreator.Character;
import org.example.CharacterCreator.DnDClass.ClassFactory;

public class FactoryMethodPatternDemo {
    public static void main(String[] args) {
        ClassFactory classFactory = new ClassFactory();

        Character character1 = new Character("Hackerman", classFactory.getClass("Bard"));
        character1.addBonus();
        character1.printSheet();

        System.out.println();

        Character character2 = new Character("Connor", classFactory.getClass("Fighter"));
        character2.addBonus();
        character2.printSheet();
    }
}