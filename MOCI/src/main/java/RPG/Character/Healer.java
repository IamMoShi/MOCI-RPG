package main.java.RPG.Character;

public class Healer extends GameCharacter {

    private int wisdom;

    public Healer(String name, int health, int experiencePoints, int level) {
        super(name, health, experiencePoints, level);
        this.wisdom = 0;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
}
