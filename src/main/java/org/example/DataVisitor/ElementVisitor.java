package org.example.DataVisitor;

import org.example.CharacterCreator.Character;
import org.example.CharacterCreator.DnDClass.CharacterClass;
import org.example.CharacterCreator.DnDRace.CharacterRace;
import org.example.CharacterCreator.Stats;

public class ElementVisitor implements DataElementsVisitor{
    @Override
    public void visit(Character character) {
        character.accept();
    }

    @Override
    public void visit(Stats stats) {
        stats.accept();
    }

    @Override
    public void visit(CharacterClass characterClass) {
        characterClass.accept();
    }

    @Override
    public void visit(CharacterRace characterRace) {
        characterRace.accept();
    }
}
