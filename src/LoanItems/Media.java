package LoanItems;

public class Media {
    protected String title;
    protected String type;

//  Konstruktør
    public Media(String title, String type) {
        this.title = title;
        this.type = type;
    }

//    Vores toString metode
    @Override
    public String toString() {
        return title + type;
    }

    public String getTitle() {
        return title;
    }
    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }
}
