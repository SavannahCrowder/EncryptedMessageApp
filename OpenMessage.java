import javax.swing.*;

public class OpenMessage implements Message {
    private String body;
    private String to;
    private String subject;
    private String from;

    public OpenMessage(String body, String to, String subject, String from) {
        this.body = body;
        this.to = to;
        this.subject = subject;
        this.from = from;
    }
    public String getBody(){
    return body;
    }
    public String getTo() {
        return to;
    }
    public String getSubject() {
        return subject;
    }
    public String getFrom() {
        return from;
    }

    @Override
    public boolean search(String term, String part) {
        return part.toLowerCase().contains(term.toLowerCase());
    }

    @Override
    public boolean searchSubject(String term) {
        return search(term, subject);
    }

    @Override
    public boolean searchTo(String term) {
        return search(term, to);
    }

    @Override
    public boolean searchFrom(String term) {
        return search(term, from);
    }
}