package org.example.CharacterCreator.DnDClass;

public abstract class CharacterClass {
    private String name;
    private int hp;

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void printMagika();

    public String toString() {
        return "Name of class: " + name + "\nHealth points: " + hp;
    }
}