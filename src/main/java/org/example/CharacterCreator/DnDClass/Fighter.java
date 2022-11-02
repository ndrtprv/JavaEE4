package org.example.CharacterCreator.DnDClass;

public class Fighter extends CharacterClass {
    private final String perk;

    public Fighter() {
        setName("Fighter");
        setHp(10);
        perk = "Extra Attack";
    }

    public String getPerk() {
        return perk;
    }

    @Override
    public void printMagika() {
        System.out.println("Perk: " + perk);
    }

    /*@Override
    public void accept() {
        System.out.println("Class name: " + getName());
        System.out.println("Default HP: " + getHP());
        printMagika();
    }*/
}