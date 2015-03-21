package books.api.model;

import books.api.model.user.Reputation;

public class User {
    private final int id;
    private String userName;
    private Reputation reputation;

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Reputation getReputation() {
        return reputation;
    }

    public void setReputation(Reputation reputation) {
        this.reputation = reputation;
    }
}
