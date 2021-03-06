public class Player {

    private Stats stats;
    private Score score;
    private String name;

    public Player(String name) {
        stats = new Stats();
        score = new Score();
        this.name = name;
    }

    // Gets

    public Stats getStats() {
        return stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void resetScore() {
        score.resetScore();
    }

    public Score getScoreObject() {
        return score;
    }

    public int getScoreInt() {
        return score.getScore();
    }
}
