package main.java.RPG.Character;

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
}
