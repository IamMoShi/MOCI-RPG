package main.java.RPG.Character.Creator;

import main.java.RPG.Character.GameCharacter;
import main.java.RPG.GameConfiguration.GameDifficulty;

public interface CharacterCreator {
    public GameCharacter createCharacter(String name);
    public GameCharacter createCharacter(String name, int health, int experiencePoints, int level);
}
