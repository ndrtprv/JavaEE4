package org.example.CharacterCreator;

import org.example.CharacterCreator.DnDClass.CharacterClass;
import org.example.CharacterCreator.DnDRace.CharacterRace;
import org.example.DataVisitor.DataElement;

public class Character implements DataElement {
    private String name;
    private CharacterClass dndClass;
    private CharacterRace race;
    private Stats attributes;

    public Character (String name, CharacterClass dndClass, CharacterRace race) {
        this.name = name;
        this.dndClass = dndClass;
        this.race = race;
        this.attributes = Stats.generate();
    }

    public void printSheet() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + dndClass.getName());
        System.out.println("Race: " + race.getName());
        attributes.print();
        dndClass.printMagika();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRace(CharacterRace race) {
        this.race = race;
    }

    public CharacterRace getRace() {
        return race;
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

    public void addRaceBonuses() {
        for (String s : attributes.getStats().keySet()) {
            attributes.getStats().put(s, attributes.getStats().get(s) + race.getBonuses().getStats().get(s));
        }
    }

    public void talk() {
        System.out.print(race.getName() + " " + name + " saying: ");
        race.saySMTH();
    }

    @Override
    public void accept() {
        System.out.println("Character's name: " + name);
    }

    public CharacterClass getDndClass() {
        return dndClass;
    }

    public void setDndClass(CharacterClass dndClass) {
        this.dndClass = dndClass;
    }
}