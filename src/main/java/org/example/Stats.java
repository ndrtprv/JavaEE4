package org.example;

import java.util.HashMap;

public class Stats {
    private HashMap<String, Integer> stats;

    public static Stats generate() {
        Stats stats = new Stats();
        Dice dice = new Dice();
        stats.stats = new HashMap<>();

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
}