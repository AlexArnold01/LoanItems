package LoanItems;

public class Video extends Media {
    //Fuld konstruktør
    public Video(String type, String title) {
        super(type, title);
    }

    @Override
    public String toString() {
        return "Video" + title;
    }
}
