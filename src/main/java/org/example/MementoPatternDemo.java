package org.example;

import org.example.memen.*;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Character character = new Character("Hackerman", "hacker");
        character.printSheet();
        System.out.println();

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        character.setAttributes();
        originator.setState(character.getAttributes());
        careTaker.add(originator.saveStateToMemento());

        character.setAttributes();
        originator.setState(character.getAttributes());
        careTaker.add(originator.saveStateToMemento());

        character.setAttributes();
        originator.setState(character.getAttributes());
        careTaker.add(originator.saveStateToMemento());

        System.out.println("Saved state #1:");
        careTaker.get(0).getState().print();
        System.out.println();

        System.out.println("Saved state #2:");
        careTaker.get(1).getState().print();
        System.out.println();

        System.out.println("Saved state #3:");
        careTaker.get(2).getState().print();
        System.out.println();
    }
}