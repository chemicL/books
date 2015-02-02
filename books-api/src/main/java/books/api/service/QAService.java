package books.api.service;

import books.api.model.Answer;
import books.api.model.Question;

import java.util.List;

public interface QAService {
    Question getById(Long id);
    List<Question> getAllQuestions();
    List<Question> getQuestionsForUser(long id);
    List<Answer> getAnswersForUser(long id);
    Long addQuestion(Question question);
    Long addAnswer(Long questionId, Answer answer);

    // Perhaps people with higher reputation add more?
    boolean upvoteAnswer(long id);
    boolean upvoteQuestion(long id);
}
