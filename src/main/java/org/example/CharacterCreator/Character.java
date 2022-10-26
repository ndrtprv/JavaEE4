package org.example.CharacterCreator;

import org.example.CharacterCreator.DnDClass.CharacterClass;

public class Character {
    private String name;
    private CharacterClass dndClass;
    private Stats attributes;

    public Character (String name, CharacterClass dndClass) {
        this.name = name;
        this.dndClass = dndClass;
        this.attributes = Stats.generate();
    }

    public void printSheet() {
        System.out.println("Name: " + name);
        System.out.println(dndClass);
        attributes.print();
        dndClass.printMagika();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDndClass(CharacterClass dndClass) {
        this.dndClass = dndClass;
    }

    public CharacterClass getDndClass() {
        return dndClass;
    }

    public void setAttributes() {
        this.attributes = Stats.generate();
    }

    public Stats getAttributes() {
        return attributes;
    }

    public void addBonus() {
        int hp = dndClass.getHP() + ((int)Math.floor(attributes.getStats().get("Constitution") / 2.) - 5);
        attributes.getStats().put("Health", hp);
    }
}