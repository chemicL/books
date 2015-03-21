package books.api.service;

import books.api.model.User;
import books.api.model.user.Reputation;

public interface UserService {
    Reputation getUserReputation();
    User getUser(int id);

}
