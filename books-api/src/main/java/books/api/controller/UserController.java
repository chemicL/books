package books.api.controller;

import books.api.model.Answer;
import books.api.model.Question;
import books.api.model.User;
import books.api.service.QAService;
import books.api.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private QAService qaService;

    @RequestMapping("/user/{id}")
    @ResponseBody
    public User getUser(int userId) {
        return userService.getUser(userId);
    }

    @RequestMapping("/user/{id}/questions")
    @ResponseBody
    public List<Question> getUserQuestions(int id) {
        return qaService.getQuestionsForUser(id);
    }

    @RequestMapping("/user/{id}/answers")
    @ResponseBody
    public List<Answer> getUsersAnswers(int id) {
        return qaService.getAnswersForUser(id);
    }
}
