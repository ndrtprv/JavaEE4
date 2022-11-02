package org.example.DataVisitor;

import org.example.CharacterCreator.Character;
import org.example.CharacterCreator.DnDClass.CharacterClass;
import org.example.CharacterCreator.DnDRace.CharacterRace;
import org.example.CharacterCreator.Stats;

public interface DataElementsVisitor {
    void visit(Character character);
    void visit(Stats stats);
    void visit(CharacterClass characterClass);
    void visit(CharacterRace characterRace);
}