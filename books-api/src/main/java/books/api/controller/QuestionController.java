package books.api.controller;

import books.api.model.Answer;
import books.api.model.Question;
import books.api.service.QAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    private QAService qaService;

    @RequestMapping("/questions/{id}")
    @ResponseBody
    public Question get(@PathVariable(value = "id") Long id) {
        return qaService.getById(id);
    }

    @RequestMapping("/questions/mostRecent")
    @ResponseBody
    public List<Question> getMostRecent() {
        return qaService.getAllQuestions(); // for now
    }

    @RequestMapping("/questions")
    @ResponseBody
    public List<Question> getAll() {
        return qaService.getAllQuestions();
    }

    @RequestMapping(value = "/questions", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public long addQuestion(@RequestBody Question question) {
        return qaService.addQuestion(question);
    }

    @RequestMapping(value = "/questions/{questionId}/answers", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public long addAnswer(@RequestBody Answer answer, @PathVariable("questionId") long questionId) {
        return qaService.addAnswer(questionId, answer);
    }
}
