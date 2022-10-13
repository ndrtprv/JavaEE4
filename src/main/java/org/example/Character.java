package org.example;

public class Character {
    private String name;
    private String dndClass;
    private Stats attributes;

    public Character (String name, String dndClass) {
        this.name = name;
        this.dndClass = dndClass;
        this.attributes = Stats.generate();
    }

    public void printSheet() {
        System.out.println("Name: " + name);
        System.out.println("DnD class: " + dndClass);
        attributes.print();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDndClass(String dndClass) {
        this.dndClass = dndClass;
    }

    public String getDndClass() {
        return dndClass;
    }

    public void setAttributes() {
        this.attributes = Stats.generate();
    }

    public Stats getAttributes() {
        return attributes;
    }
}