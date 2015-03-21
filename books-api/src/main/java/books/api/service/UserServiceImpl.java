package books.api.service;

import books.api.model.User;
import books.api.model.user.Reputation;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    public Reputation getUserReputation(int userId) {
        return new Reputation(100.0);
    }

    public User getUser(int id) {
        User user = new User(id);
        user.setReputation(getUserReputation(id));
        user.setUserName("czerwony");
        return user;
    }
}
