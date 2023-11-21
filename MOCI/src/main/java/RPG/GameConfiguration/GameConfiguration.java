package main.java.RPG.GameConfiguration;


public class GameConfiguration {

    private static GameConfiguration instance;
    private GameDifficulty difficulty;
    private int teamSize;


    public static GameConfiguration getInstance(int difficultyLevel, int teamSize) {
        if (instance==null) return instance;
        return new GameConfiguration(difficultyLevel, teamSize);
    }


    private GameConfiguration(int difficultyLevel, int teamSize) {
        this.difficulty = new GameDifficulty(difficultyLevel);
        setTeamSize(teamSize);
    }


    public void setTeamSize(int teamSize) {
        if (teamSize < 1) teamSize = 1;
        this.teamSize = teamSize;
    }

    public void setDifficultyLevel(int difficulty) {
        this.difficulty.setDifficultyLevel(difficulty);
    }

    publci void setDifficulty(GameDifficulty gameDifficulty) {
        this.difficulty = gameDifficulty;
    }

    public int getTeamSize() {
        return this.teamSize;
    }

    public int getDifficultyLevel() {
        return this.difficulty.getDifficultyLevel();
    }

    public GameDifficulty getDifficulty() {
        return this.difficulty;
    }
}
