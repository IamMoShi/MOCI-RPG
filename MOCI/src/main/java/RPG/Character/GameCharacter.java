package main.java.RPG.Character;

public class GameCharacter {
    private String name;
    private int health;
    private int experiencePoints;
    private int level;

    public GameCharacter(String name, int health, int experiencePoints, int level) {
        this.name = name;
        this.health = health;
        this.experiencePoints = experiencePoints;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
