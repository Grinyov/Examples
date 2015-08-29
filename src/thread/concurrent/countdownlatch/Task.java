package thread.concurrent.countdownlatch;

/**
 * Created by green on 30.08.2015.
 *
 * класс-носитель информации
 *
 *
 */
public class Task {
    private String content;
    private String answer;
    private int mark;
    public Task(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
}
