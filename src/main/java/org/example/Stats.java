package org.example;

public class Stats {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intellect;
    private int wisdom;
    private int charisma;

    public static Stats generate() {
        Stats stats = new Stats();
        Dice dice = new Dice();
        stats.strength = dice.rollStats();
        stats.dexterity = dice.rollStats();
        stats.constitution = dice.rollStats();
        stats.intellect = dice.rollStats();
        stats.wisdom = dice.rollStats();
        stats.charisma = dice.rollStats();
        return stats;
    }

    public void print() {
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Constitution: " + constitution);
        System.out.println("Intellect: " + intellect);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Charisma: " + charisma);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }
}