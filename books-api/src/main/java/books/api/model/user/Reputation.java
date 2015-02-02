package books.api.model.user;

public class Reputation {
    private double score;

    public Reputation(final double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
