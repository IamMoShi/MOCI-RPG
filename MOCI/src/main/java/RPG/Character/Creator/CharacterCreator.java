package main.java.RPG.Character.Creator;

import main.java.RPG.Character.GameCharacter;

public interface CharacterCreator {
    GameCharacter createCharacter(String name, int health, int experiencePoints, int level);
}
