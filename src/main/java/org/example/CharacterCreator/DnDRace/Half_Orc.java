package org.example.CharacterCreator.DnDRace;

import org.example.CharacterCreator.Stats;

public class Half_Orc extends CharacterRace {

    public Half_Orc() {
        setName("Half-Orc");
        setBonuses(new Stats(2, 0, 1, 0, 0, 0));
    }

    @Override
    public void saySMTH() {
        System.out.println(" ");
    }

    /*@Override
    public void accept() {

    }*/
}