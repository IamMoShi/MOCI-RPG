package main.java.RPG.GameConfiguration;

public class GameDifficulty {
    // To set the difficulty of a game
    private int difficultyLevel;
    private static final int minDifficulty = 0;
    private static final int maxDifficulty = 5;

    public GameDifficulty(int difficultyLevel) {
        if (difficultyLevel < minDifficulty) difficultyLevel = minDifficulty;
        if (difficultyLevel > maxDifficulty) difficultyLevel = maxDifficulty;
        this.difficultyLevel = difficultyLevel;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    protected void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
