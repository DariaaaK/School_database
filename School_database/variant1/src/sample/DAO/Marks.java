package sample.DAO;

public class Marks {
    private String subject;
    private int mark;

    public Marks(String subject, int mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
