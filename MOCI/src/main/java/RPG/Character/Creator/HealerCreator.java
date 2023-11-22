package main.java.RPG.Character.Creator;

import main.java.RPG.Character.GameCharacter;
import main.java.RPG.Character.Healer;

public class HealerCreator implements CharacterCreator {
    public GameCharacter createCharacter(String name, int health, int experiencePoints, int level) {
        return new Healer(name, health, experiencePoints, level);
    }
}
