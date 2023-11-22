package main.java.RPG.Character;

import main.java.RPG.Character.CharacterVisitor.CharacterVisitor;

public class Warrior extends GameCharacter {
    private int strength;

    public Warrior(String name, int health, int experiencePoints, int level) {
        super(name, health, experiencePoints, level);
        this.strength = 0;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void accept(CharacterVisitor visitor) {
        visitor.visitWarrior(this);
    }
}
