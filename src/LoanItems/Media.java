package LoanItems;

public class Media {
    protected String title;
    protected String type;


    public Media(String title, String type) {
        this.title = title;
        this.type = type;
    }

    @Override
    public String toString() {
        return title + type;
    }

    public String getTitle() {
        return getTitle();
    }
    public String getType() {
        return getType();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }
}
