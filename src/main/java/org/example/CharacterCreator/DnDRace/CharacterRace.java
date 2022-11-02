package org.example.CharacterCreator.DnDRace;

import org.example.CharacterCreator.Stats;
import org.example.DataVisitor.DataElement;

public abstract class CharacterRace implements DataElement {
    private String name;
    private Stats bonuses;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBonuses(Stats bonuses) {
        this.bonuses = bonuses;
    }

    public Stats getBonuses() {
        return bonuses;
    }

    public void print() {
        System.out.println("Name of race: " + name);
        for (String s: bonuses.getStats().keySet()) {
            System.out.println("Race bonus " + s + ": " + bonuses.getStats().get(s));
        }
    }

    public abstract void saySMTH();

    public void accept() {
        System.out.println("Name of race: " + name);
        System.out.print("Saying: ");
        saySMTH();
    }
}