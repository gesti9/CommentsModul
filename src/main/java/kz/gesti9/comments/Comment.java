package kz.gesti9.comments;

import java.util.List;

public class Comment {
    private String authorName;
    private String body;
    private List <Comment> answers;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getContent(){
        return "Автор: " + authorName + "\n" + body ;
    }

    public List<Comment> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Comment> answers) {
        this.answers = answers;
    }
}
