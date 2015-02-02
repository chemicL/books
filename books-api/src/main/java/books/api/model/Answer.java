package books.api.model;

public class Answer {
    private Long id;
    private Book content;
    private Integer votes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getContent() {
        return content;
    }

    public void setContent(Book content) {
        this.content = content;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}
