package org.example.CharacterCreator;

import org.example.CharacterCreator.DnDRace.CharacterRace;

public class Character {
    private String name;
    private CharacterRace race;
    private Stats attributes;

    public Character (String name, CharacterRace race) {
        this.name = name;
        this.race = race;
        this.attributes = Stats.generate();
    }

    public void printSheet() {
        System.out.println("Name: " + name);

        attributes.print();
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

    public void addRaceBonuses() {
        for (String s : attributes.getStats().keySet()) {
            attributes.getStats().put(s, attributes.getStats().get(s) + race.getBonuses().getStats().get(s));
        }
    }

    public void talk() {
        System.out.print(race.getName() + " saying: ");
        race.saySMTH();

        race.print();
    }
}