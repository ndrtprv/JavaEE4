package org.example.CharacterCreator.DnDRace;

public class GnomeFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Gnome();
    }
}
