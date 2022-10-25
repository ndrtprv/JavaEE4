package org.example;

public class Half_OrcFactory implements RaceAbstractFactory{
    @Override
    public CharacterRace create() {
        return new Half_Orc();
    }
}