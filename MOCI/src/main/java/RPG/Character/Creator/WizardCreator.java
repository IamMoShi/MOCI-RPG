package main.java.RPG.Character.Creator;

import main.java.RPG.Character.GameCharacter;
import main.java.RPG.Character.Wizard;

public class WizardCreator implements CharacterCreator {
    public GameCharacter createCharacter(String name, int health, int experiencePoints, int level) {
        return new Wizard(name, health, experiencePoints, level);
    }
}
