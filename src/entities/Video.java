package entities;

public class Video extends Lesson {
    private String url;
    private Integer seconds;

    public Video() {
        super();
    }

    public Video(String title, String url, Integer seconds) {
        super(title);
        this.url = url;
        this.seconds = seconds;
    }

    @Override
    public int duration() {
        return seconds;

    }
}
