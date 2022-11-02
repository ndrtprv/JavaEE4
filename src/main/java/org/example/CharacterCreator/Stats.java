package org.example.CharacterCreator;

import org.example.DataVisitor.DataElement;

import java.util.HashMap;

public class Stats implements DataElement {
    private HashMap<String, Integer> stats;

    public Stats() {
        stats = new HashMap<>();
    }

    public Stats(int str, int dex, int con, int intel, int wis, int charisma) {
        stats = new HashMap<>();
        stats.put("Strength", str);
        stats.put("Dexterity", dex);
        stats.put("Constitution", con);
        stats.put("Intellect", intel);
        stats.put("Wisdom", wis);
        stats.put("Charisma", charisma);
    }

    public static Stats generate() {
        Stats stats = new Stats();
        Dice dice = new Dice();

        stats.stats.put("Strength", dice.rollStats());
        stats.stats.put("Dexterity", dice.rollStats());
        stats.stats.put("Constitution", dice.rollStats());
        stats.stats.put("Intellect", dice.rollStats());
        stats.stats.put("Wisdom", dice.rollStats());
        stats.stats.put("Charisma", dice.rollStats());

        return stats;
    }

    public void print() {
        for (String s: stats.keySet()) {
            System.out.println(s + ": " + stats.get(s));
        }
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    @Override
    public void accept() {
        System.out.println("Attributes:");
        print();
    }
}