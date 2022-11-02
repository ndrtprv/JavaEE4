package org.example;

import org.example.CharacterCreator.Character;
import org.example.CharacterCreator.DnDClass.ClassFactory;
import org.example.CharacterCreator.DnDRace.GnomeFactory;
import org.example.CharacterCreator.DnDRace.Half_OrcFactory;
import org.example.CharacterCreator.DnDRace.RaceAbstractFactory;
import org.example.DataVisitor.DataElement;
import org.example.DataVisitor.ElementVisitor;
import org.json.simple.*;

import java.io.*;
import java.util.*;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ElementVisitor elementVisitor = new ElementVisitor();

        JSONObject jsonObject;

        ClassFactory classFactory = new ClassFactory();

        RaceAbstractFactory raceAbstractFactory1 = new GnomeFactory();
        RaceAbstractFactory raceAbstractFactory2 = new Half_OrcFactory();

        try {
            FileWriter fw = new FileWriter("heroes.json");

            Character character1 = new Character("Zaluzhnyi", classFactory.getClass("Fighter"), raceAbstractFactory1.create());
            character1.addRaceBonuses();
            character1.addBonus();

            fw.write("[");
            jsonObject = formObject(character1, elementVisitor);
            fw.write(jsonObject.toJSONString());
            fw.write(",");

            Character character2 = new Character("Povoroznyuk", classFactory.getClass("Bard"), raceAbstractFactory2.create());
            character2.addRaceBonuses();
            character2.addBonus();

            jsonObject = formObject(character2, elementVisitor);
            fw.write(jsonObject.toJSONString());
            fw.write("]");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JSONObject formObject(Character character, ElementVisitor elementVisitor) {
        List<DataElement> dataElements = new LinkedList<>();

        dataElements.add(character);
        dataElements.add(character.getDndClass());
        dataElements.add(character.getRace());
        dataElements.add(character.getAttributes());

        JSONObject jsonObject = new JSONObject();

        for (DataElement element: dataElements) {
            jsonObject.putAll(element.accept(elementVisitor));
        }

        return jsonObject;
    }
}