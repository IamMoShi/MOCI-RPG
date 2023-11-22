package main.java.RPG.Character;

import main.java.RPG.Character.CharacterVisitor.CharacterVisitor;

public class Wizard extends GameCharacter {

    private int intelligence;

    public Wizard(String name, int health, int experiencePoints, int level) {
        super(name, health, experiencePoints, level);
        this.intelligence = 0;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void accept(CharacterVisitor visitor) {
        visitor.visitWizard(this);
    }
}
