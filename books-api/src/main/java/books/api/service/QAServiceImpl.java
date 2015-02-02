package books.api.service;

import books.api.model.Answer;
import books.api.model.Book;
import books.api.model.Question;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class QAServiceImpl implements QAService {

    @Override
    public Question getById(Long id) {
        Question question = new Question();
        Answer answer = new Answer();
        Book book = new Book();
        book.setTitle("Hobbit");
        book.setAuthor("J.R.R. Tolkien");
        answer.setVotes(100);
        answer.setContent(book);
        question.setContent("Where can I read about hobbits?");
        question.setVotes(5);
        question.setAnswers(Arrays.asList(answer));
        return question;
    }

    @Override
    public List<Question> getAllQuestions() {
        Question question = new Question();
        Answer answer = new Answer();
        Book book = new Book();
        book.setTitle("Hobbit");
        book.setAuthor("J.R.R. Tolkien");
        answer.setVotes(100);
        answer.setContent(book);
        question.setContent("Where can I read about hobbits?");
        question.setVotes(5);
        question.setAnswers(Arrays.asList(answer));
        return Collections.singletonList(question);
    }

    @Override
    public Long addQuestion(Question question) {
        return new Long(1);
    }

    @Override
    public Long addAnswer(Long questionId, Answer answer) {
        return new Long(1);
    }

    @Override
    public List<Question> getQuestionsForUser(long id) {
        return getAllQuestions();
    }

    @Override
    public List<Answer> getAnswersForUser(long id) {
        Answer answer = new Answer();
        Book book = new Book();
        book.setTitle("Hobbit");
        book.setAuthor("J.R.R. Tolkien");
        answer.setVotes(100);
        answer.setContent(book);
        return Collections.singletonList(answer);
    }

    @Override
    public boolean upvoteAnswer(long id) {
        return true;
    }

    @Override
    public boolean upvoteQuestion(long id) {
        return true;
    }
}
