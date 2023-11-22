package main.java.RPG.Character.Creator;

import main.java.RPG.Character.GameCharacter;

import main.java.RPG.Character.Warrior;

public class WarriorCreator implements CharacterCreator {
    public GameCharacter createCharacter(String name, int health, int experiencePoints, int level) {
        return new Warrior(name, health, experiencePoints, level);
    }
}
