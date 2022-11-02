package org.example.DataVisitor;

import org.example.CharacterCreator.Character;
import org.example.CharacterCreator.DnDClass.CharacterClass;
import org.example.CharacterCreator.DnDRace.CharacterRace;
import org.example.CharacterCreator.Stats;

import java.util.TreeMap;

public interface DataElementsVisitor {
    TreeMap<Object, Object> visit(Character character);
    TreeMap<Object, Object> visit(Stats stats);
    TreeMap<Object, Object> visit(CharacterClass characterClass);
    TreeMap<Object, Object> visit(CharacterRace characterRace);
}